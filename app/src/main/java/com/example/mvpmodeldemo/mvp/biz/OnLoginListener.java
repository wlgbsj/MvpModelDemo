package com.example.mvpmodeldemo.mvp.biz;

import com.example.mvpmodeldemo.mvp.bean.User;

/**
 * Created by wlgbsj on 2017/3/2.
 */
public interface OnLoginListener {
    void loginSuccess(User user);

    void loginFailed();
}
