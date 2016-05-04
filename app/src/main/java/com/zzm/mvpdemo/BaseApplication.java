package com.zzm.mvpdemo;

import android.app.Application;
import android.os.Handler;

import com.baidu.apistore.sdk.ApiStoreSDK;

/**
 * 全局上下文
 */
public class BaseApplication extends Application {

    private static BaseApplication application;
    public static long MainThreadId;
    public static Handler handler;

    @Override
    public void onCreate() {
        super.onCreate();
        application = this;
        handler = new Handler();
        MainThreadId = android.os.Process.myTid();
        // 设置错误的管理器
        Thread.setDefaultUncaughtExceptionHandler(new MyUncaughtExceptionHandler());
        initService();
        initOnCreate();
    }

    private void initService() {

        //百度API
        ApiStoreSDK.init(this, "1eb7a236a24896127ea292b4247813e7");

    }


    private class MyUncaughtExceptionHandler implements
            Thread.UncaughtExceptionHandler {

        @Override
        public void uncaughtException(Thread thread, Throwable ex) {
//			LogUtils.i("发现了错误");
            dealWrongText(ex);
        }
    }

    /**
     * 子类实现onCreate（有需要的话）
     */
    public void initOnCreate(){}

    /**
     * 子类处理捕获的错误
     * @param ex
     */
    public void dealWrongText(Throwable ex) {};

    public static BaseApplication getApplication() {
        return application;
    }

    public static Handler getHandler() {
        return handler;
    }
}
