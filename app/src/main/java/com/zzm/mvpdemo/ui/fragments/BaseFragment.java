package com.zzm.mvpdemo.ui.fragments;

import com.zzm.mvpdemo.utils.ViewUtils;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import butterknife.ButterKnife;

public abstract class BaseFragment extends Fragment {

	private View view;

	@Override
	public View onCreateView(LayoutInflater inflater,
			 ViewGroup container, Bundle savedInstanceState) {

		view = inflater.inflate(getResource(), container, false);
		ButterKnife.bind(this, view);
		initView(view);
		initDate();

		return view;
	}

	/**
	 * 加载数据
	 */
	protected void initDate() {
	}
	/**
	 * 加载布局
	 */
	protected void initView(View v) {
	}
	/**
	 * 得到布局文件
	 * @return
	 */
	protected abstract int getResource();
}
