package com.example.lenovo.weather;

/**
 * Created by lenovo on 2017/6/22.
 */
public interface HttpCallbackListener {
    // 成功时回调
    void onFinish(String response);

    // 出错时回调
    void onError(Exception e);

}
