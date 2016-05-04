package com.zzm.mvpdemo.utils;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;


public class ViewUtils {

	public static void removeViewParent(View view){
		//获取到孩子的爹，再用爹移除孩子
		ViewParent parent = view.getParent();
		ViewGroup group = (ViewGroup) parent;
		group.removeView(view);
	}
	
	
}
