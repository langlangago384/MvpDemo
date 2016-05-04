package com.zzm.mvpdemo.models;

import com.baidu.apistore.sdk.ApiCallBack;
import com.baidu.apistore.sdk.ApiStoreSDK;
import com.baidu.apistore.sdk.network.Parameters;
import com.zzm.mvpdemo.beans.JokeBean;
import com.zzm.mvpdemo.commons.HttpUrls;
import com.zzm.mvpdemo.utils.GsonTools;
import com.zzm.mvpdemo.utils.LogUtils;

/**
 * Created by PrettyBoy on 2016/5/3.
 */
public class JokeModelImpl implements JokeModel{


    @Override
    public void loadData(int page, final IViewListener<JokeBean> listener) {

        Parameters para = new Parameters();
        para.put("page", page+"");
        ApiStoreSDK.execute(HttpUrls.JOKEURL, ApiStoreSDK.GET, para,
                new ApiCallBack() {
                    @Override
                    public void onSuccess(int status, String responseString) {
                        LogUtils.e("weather",responseString);
                        JokeBean jokeBean = GsonTools.changeGsonToBean(responseString, JokeBean.class);
                        listener.onSuccess(jokeBean);
                        listener.onSuccessForList(jokeBean.getShowapi_res_body().getContentlist());
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
