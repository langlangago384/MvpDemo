package com.zzm.mvpdemo.ui.adapter;

import java.util.List;


import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

public abstract class MyDefaultAdapter<T> extends BaseAdapter {

	public List<T> datas;
	
	public MyDefaultAdapter(List<T> datas) {
		this.datas = datas;
	}

	public void clearDatas(List<T> data){
		if(this.datas!=null&&this.datas.size()>0){
			this.datas.removeAll(datas);
			this.datas.clear();
		}
		this.datas = data;
	}

	public void addDatas(List<T> data){
		this.datas.addAll(data);
	}

	@Override
	public int getCount() {
		return datas.size();
	}

	@Override
	public Object getItem(int position) {
		return datas.get(position);
	}

	@Override
	public long getItemId(int position) {
		return position;
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		BaseHolder holder = null;
		if(convertView==null){
			holder=getHolder();
		}else{
			holder=(BaseHolder) convertView.getTag();
		}
		T data = datas.get(position);
		holder.setData(data);
		
		return holder.getContentView();
	}
	
	protected abstract BaseHolder<T> getHolder();
}
