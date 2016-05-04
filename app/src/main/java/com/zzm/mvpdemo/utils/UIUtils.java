package com.zzm.mvpdemo.utils;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Handler;
import android.view.View;
import android.widget.Toast;

import com.zzm.mvpdemo.BaseApplication;
import com.zzm.mvpdemo.ui.activitys.BaseActivity;

public class UIUtils {

	private static Toast mToast;
	
	/**
	 * 吐司
	 * @param stringId
	 */
	public static void showToast(final int stringId){
		if ("main".equals(Thread.currentThread().getName())){
			if (mToast != null)
				mToast.setText(stringId);
			else {
				mToast = Toast.makeText(getContext(), stringId, Toast.LENGTH_SHORT);
			}
			mToast.show();
		}else{
			runOnUiThread(new Runnable() {
				@Override
				public void run() {
					if (mToast != null)
						mToast.setText(stringId);
					else {
						mToast = Toast.makeText(getContext(), stringId, Toast.LENGTH_SHORT);
					}
					mToast.show();
				}
			});
		}
	}
	/**
	 * 吐司
	 * @param str
	 */
	public static void showToast(final String str){
		if ("main".equals(Thread.currentThread().getName())){
			if (mToast != null)
				mToast.setText(str);
			else {
				mToast = Toast.makeText(getContext(), str, Toast.LENGTH_SHORT);
			}
			mToast.show();
		}else{
			runOnUiThread(new Runnable() {
				@Override
				public void run() {
					if (mToast != null)
						mToast.setText(str);
					else {
						mToast = Toast.makeText(getContext(), str, Toast.LENGTH_SHORT);
					}
					mToast.show();
				}
			});
		}
	}
	
	/**
	 * 在主程序执行一段逻辑
	 * @param runnable
	 */
	public static void runOnUiThread(Runnable runnable){
		if(android.os.Process.myTid() == BaseApplication.MainThreadId){
			runnable.run();
		}else{
			Handler handler = BaseApplication.getHandler();
			handler.post(runnable);
		}
	}
	
	/**
	 * 获得资源
	 * @return
	 */
	public static Resources getResource() {
		return getContext().getResources();
	}
	/**
	 * 获得上下文
	 * @return
	 */
	public static Context getContext() {
		return BaseApplication.getApplication();
	}
	/**
	 * 创建一个布局
	 * @param resource
	 * @return
	 */
	public static View createView(int resource){
		return View.inflate(getContext(), resource, null);
	}
	
	/**
	 * 获得string
	 * @param id
	 * @return
	 */
	public static String getString(int id){
		return getResource().getString(id);
	}
	/**
	 * 获得string数组
	 * @param id
	 * @return
	 */
	public static String[] getStringArray(int id) {
		return getResource().getStringArray(id);
	}

	public static void startActivity(Intent intent) {
		if(BaseActivity.activity!=null){
			BaseActivity.activity.startActivity(intent);
		}else{
			//不在界面启动则需设置flags
			intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
			getContext().startActivity(intent);
		}
	}

}
