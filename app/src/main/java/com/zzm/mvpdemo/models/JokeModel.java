package com.zzm.mvpdemo.models;

import com.zzm.mvpdemo.beans.JokeBean;

/**
 * Created by PrettyBoy on 2016/5/3.
 */
public interface JokeModel {

    void loadData(int page,IViewListener<JokeBean> listener);


}
