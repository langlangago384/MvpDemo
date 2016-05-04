package com.zzm.mvpdemo.presenter;

import com.zzm.mvpdemo.beans.WeatherBean;
import com.zzm.mvpdemo.commons.HttpUrls;
import com.zzm.mvpdemo.models.IViewListener;
import com.zzm.mvpdemo.models.WeatherModelImpl;
import com.zzm.mvpdemo.ui.views.MainView;

import java.util.List;

/**
 * Created by PrettyBoy on 2016/5/3.
 */
public class WeatherPresenter {


    private MainView mainView;
    private WeatherModelImpl weatherModel;

    public WeatherPresenter(MainView mainView) {
        this.mainView = mainView;
        this.weatherModel = new WeatherModelImpl();
    }

    public void loadData(){
        mainView.showLoading();
        weatherModel.loadWeather(HttpUrls.WEATHERURL, new IViewListener<WeatherBean>() {
            @Override
            public void onSuccess(WeatherBean weatherBean) {
//                mainView.setTestText(weatherBean.getMsg());
                mainView.hideLoading();
            }

            @Override
            public void onSuccessForList(List list) {
            }

            @Override
            public void onFailure(String msg, Exception e) {
//                mainView.setTestText(msg);
            }
        });


    }


}
