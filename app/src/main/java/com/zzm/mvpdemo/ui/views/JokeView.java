package com.zzm.mvpdemo.ui.views;

import java.util.List;

/**
 * Created by PrettyBoy on 2016/5/3.
 */
public interface JokeView extends BaseView{

    void setAdapter(List list);

    void startRefresh();

    void stopRefresh();

    void refresh(List list);

    void loadRefresh(List list);

    void setText(String str);

}
