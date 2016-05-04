package com.zzm.mvpdemo.ui.fragments;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.zzm.mvpdemo.R;
import com.zzm.mvpdemo.ui.activitys.JokeActivity;
import com.zzm.mvpdemo.utils.UIUtils;

import butterknife.OnClick;

/**
 * Created by PrettyBoy on 2016/5/3.
 */
public class RecreationFragment extends BaseFragment {

    @Override
    protected int getResource() {
        return R.layout.fragment_recreation;
    }

    @Override
    protected void initView(View v) {
        super.initView(v);
    }


    @OnClick(R.id.tv_joke)
    public void jock(View v){
        startActivity(new Intent(UIUtils.getContext(),JokeActivity.class));
    }

    @OnClick(R.id.tv_picture)
    public void picture(View v){
        startActivity(new Intent(UIUtils.getContext(),JokeActivity.class));
    }


}
