package com.zzm.mvpdemo.models;

import com.zzm.mvpdemo.beans.WeatherBean;

/**
 * Created by PrettyBoy on 2016/4/29.
 */
public interface WeatherModel {

    void loadWeather(String url,IViewListener<WeatherBean> listener);

}
