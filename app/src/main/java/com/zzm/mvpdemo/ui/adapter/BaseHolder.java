package com.zzm.mvpdemo.ui.adapter;


import android.view.View;

import butterknife.ButterKnife;

public abstract class BaseHolder<Data> {

	protected  View contentView;
	protected Data data;
	public BaseHolder(){
		contentView = initView();
		ButterKnife.bind(this,contentView);
		contentView.setTag(this);
	}

	protected abstract View initView();
	
	public abstract void refreshView();

	public View getContentView() {
		return contentView;
	}
	public Data getData() {
		return data;
	}
	public void setData(Data data) {
		this.data = data;
		refreshView();
	}

	
}
