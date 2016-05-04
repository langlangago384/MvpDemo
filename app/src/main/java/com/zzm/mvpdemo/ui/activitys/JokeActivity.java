package com.zzm.mvpdemo.ui.activitys;

import android.view.View;
import android.widget.ListView;
import android.widget.TextView;
import com.zzm.mvpdemo.R;
import com.zzm.mvpdemo.presenter.JokePresenter;
import com.zzm.mvpdemo.ui.adapter.JokeAdapter;
import com.zzm.mvpdemo.ui.views.JokeView;
import com.zzm.mvpdemo.ui.widgets.RefreshLayout;
import com.zzm.mvpdemo.utils.UIUtils;

import java.util.List;

import butterknife.BindView;

/**
 * Created by PrettyBoy on 2016/5/3.
 */
public class JokeActivity extends BaseActivity implements JokeView{

    @BindView(R.id.refreshLayout)
    RefreshLayout refreshLayout;
    @BindView(R.id.listView)
    ListView listView;
    View footerLayout;
    private JokePresenter jokePresenter;
    private JokeAdapter adapter;
    private TextView text_more;

    @Override
    protected int getLayoutId() {
        return R.layout.activity_jock;
    }

    @Override
    protected void init() {
        getSupportActionBar().setTitle("笑话");
        jokePresenter = new JokePresenter(this);
        footerLayout = getLayoutInflater().inflate(R.layout.listview_footer, null);
        listView.addFooterView(footerLayout);
        text_more = (TextView) footerLayout.findViewById(R.id.text_more);
//        refreshLayout.setChildView(listView);
        refreshLayout.setLoading(true);
        jokePresenter.loadDataRefresh(0);
        refreshLayout.setOnRefreshListener(new RefreshLayout.OnRefreshListener() {
            @Override
            public void onRefresh() {
                jokePresenter.loadDataRefresh(0);
            }
        });
        refreshLayout.setOnLoadListener(new RefreshLayout.OnLoadListener() {
            @Override
            public void onLoad() {
                jokePresenter.loadDataRefresh(1);
            }
        });
        footerLayout.findViewById(R.id.text_more).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                jokePresenter.loadDataRefresh(1);
            }
        });
    }


    @Override
    public void setAdapter(List list) {
        if(adapter==null){
            adapter = new JokeAdapter(list);
            listView.setAdapter(adapter);
        }
    }

    @Override
    public void refresh(List list) {
        if(adapter==null){
            adapter = new JokeAdapter(list);
            listView.setAdapter(adapter);
            return;
        }
        adapter.clearDatas(list);
        adapter.notifyDataSetChanged();
    }

    @Override
    public void loadRefresh(List list) {
        adapter.addDatas(list);
        adapter.notifyDataSetChanged();
    }

    @Override
    public void setText(String str) {
        text_more.setText(str);
    }

    @Override
    public void startRefresh() {
        refreshLayout.setRefreshing(true);
    }

    @Override
    public void stopRefresh() {
        refreshLayout.setRefreshing(false);
    }

    @Override
    public void showLoading() {
        UIUtils.showToast("加载中");
    }

    @Override
    public void hideLoading() {
        UIUtils.showToast("加载完成");
    }

    @Override
    public void showFailMsg() {

    }

}
