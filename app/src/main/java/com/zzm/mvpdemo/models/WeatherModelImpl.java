package com.zzm.mvpdemo.models;

import com.baidu.apistore.sdk.ApiCallBack;
import com.baidu.apistore.sdk.ApiStoreSDK;
import com.baidu.apistore.sdk.network.Parameters;
import com.zzm.mvpdemo.beans.WeatherBean;
import com.zzm.mvpdemo.utils.GsonTools;
import com.zzm.mvpdemo.utils.LogUtils;

/**
 * Created by PrettyBoy on 2016/4/29.
 */
public class WeatherModelImpl implements WeatherModel{

    @Override
    public void loadWeather(String url, final IViewListener<WeatherBean> listener) {
        Parameters para = new Parameters();
        para.put("city", "beijing");
        ApiStoreSDK.execute(url, ApiStoreSDK.GET, para,
                new ApiCallBack() {
                    @Override
                    public void onSuccess(int status, String responseString) {
                        LogUtils.e("weather",responseString);
                        WeatherBean weatherBean = GsonTools.changeGsonToBean(responseString, WeatherBean.class);
                        listener.onSuccess(weatherBean);
                    }

                    @Override
                    public void onComplete() {
                    }

                    @Override
                    public void onError(int status, String responseString, Exception e) {
                        listener.onFailure(responseString,e);
                    }

                });
    }

}
