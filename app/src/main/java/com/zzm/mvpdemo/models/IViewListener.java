package com.zzm.mvpdemo.models;

import java.util.List;

/**
 * 抽取的父接口,有扩展的继承，没扩展的直接调用
 */
public interface IViewListener<T> {

    void onSuccess(T t);

    void onSuccessForList(List list);

    void onFailure(String msg,Exception e);

}
