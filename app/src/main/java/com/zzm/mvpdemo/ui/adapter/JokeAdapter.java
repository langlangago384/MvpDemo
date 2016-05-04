package com.zzm.mvpdemo.ui.adapter;

import android.text.Html;
import android.view.View;
import android.widget.TextView;

import com.zzm.mvpdemo.R;
import com.zzm.mvpdemo.beans.JokeBean;
import com.zzm.mvpdemo.utils.UIUtils;

import java.util.List;

import butterknife.BindView;

/**
 * Created by PrettyBoy on 2016/5/3.
 */
public class JokeAdapter extends MyDefaultAdapter<JokeBean.ShowapiResBodyBean.ContentlistBean> {

    public JokeAdapter(List<JokeBean.ShowapiResBodyBean.ContentlistBean> datas) {
        super(datas);
    }

    @Override
    protected BaseHolder<JokeBean.ShowapiResBodyBean.ContentlistBean> getHolder() {
        return new JokeHolder();
    }


    public class JokeHolder extends BaseHolder<JokeBean.ShowapiResBodyBean.ContentlistBean>{

        @BindView(R.id.tv_title)
        TextView tv_title;
        @BindView(R.id.tv_msg)
        TextView tv_msg;
        @Override
        protected View initView() {
            return UIUtils.createView(R.layout.item_joke);
        }

        @Override
        public void refreshView() {
            tv_title.setText(data.getTitle());
            tv_msg.setText(Html.fromHtml(data.getText()));
        }
    }

}
