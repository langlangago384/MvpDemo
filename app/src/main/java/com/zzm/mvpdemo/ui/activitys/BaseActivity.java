package com.zzm.mvpdemo.ui.activitys;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;

import com.zzm.mvpdemo.R;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * 用于初始化activity提供方法，退出APP结束所有activity的活动
 * @author zzm
 */
public abstract class BaseActivity extends AppCompatActivity {

	@BindView(R.id.toolbar)
	Toolbar toolbar;
//加载所有的activity
	public static List<BaseActivity> mActivities = new LinkedList<BaseActivity>();
	public static BaseActivity activity;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(getLayoutId());
		ButterKnife.bind(this);
		initActionBar();
		init();
		initView();
		initData();
		synchronized (mActivities) {
			mActivities.add(this);
		}
	}

	private void initActionBar() {
		toolbar.setTitle("MVP Android");
		setSupportActionBar(toolbar);
		getSupportActionBar().setDisplayHomeAsUpEnabled(true);
		getSupportActionBar().setHomeButtonEnabled(true);
		getSupportActionBar().setHomeAsUpIndicator(R.drawable.icon_back_white);
	}

	protected abstract int getLayoutId();

	@Override
	protected void onResume() {
		super.onResume();
		activity = this;
	}

	@Override
	protected void onPause() {
		super.onPause();
		activity = null;
	}
	
	//退出APP
	public static void exitApp(){
		ArrayList<BaseActivity> copy;
		synchronized (mActivities) {
			//复制mActivities
			copy = new ArrayList<BaseActivity>(mActivities);
		}
		for (BaseActivity baseActivity : copy) {
			baseActivity.finish();
		}
	}
	@Override
	protected void onDestroy() {
		super.onDestroy();
		synchronized (mActivities) {
			mActivities.remove(this);
		}
	}
	/**
	 * 初始化数据
	 */
	protected void initData() {
	}
	/**
	 * 初始化界面布局
	 */
	protected void initView() {
	}
	/**
	 * 初始化,或子类实现onCreate
	 */
	protected void init() {
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		switch (item.getItemId()) {
			case android.R.id.home:
				onBackPressed();
				finish();
				break;
		}
		return super.onOptionsItemSelected(item);
	}
}
