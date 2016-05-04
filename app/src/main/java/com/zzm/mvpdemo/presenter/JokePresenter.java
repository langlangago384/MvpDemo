package com.zzm.mvpdemo.presenter;

import com.zzm.mvpdemo.beans.JokeBean;
import com.zzm.mvpdemo.models.IViewListener;
import com.zzm.mvpdemo.models.JokeModelImpl;
import com.zzm.mvpdemo.ui.views.JokeView;

import java.util.List;

/**
 * Created by PrettyBoy on 2016/5/3.
 */
public class JokePresenter {

    private JokeView jokeView;
    private JokeModelImpl jokeModel;
    public int mPage = 0;

    public JokePresenter(JokeView jokeView) {
        this.jokeView = jokeView;
        this.jokeModel = new JokeModelImpl();
    }

    public void loadDataRefresh(final int type){
        jokeView.showLoading();
        if(type == 0){
            mPage = 0;
        }
        jokeModel.loadData(mPage + 1, new IViewListener<JokeBean>() {
            @Override
            public void onSuccess(JokeBean jokeBean) {
            }
            @Override
            public void onSuccessForList(List list) {
                jokeView.hideLoading();
                jokeView.stopRefresh();
                mPage ++;
                if(type==0){
                    jokeView.refresh(list);
                }else{
                    jokeView.loadRefresh(list);
                }
                if(list.size()<20){
                    jokeView.setText("没有更多了");
                }else{
                    jokeView.setText("more...");
                }
            }
            @Override
            public void onFailure(String msg, Exception e) {

            }
        });

    }



}
