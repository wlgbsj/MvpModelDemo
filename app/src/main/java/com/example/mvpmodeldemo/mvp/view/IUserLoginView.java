package com.example.mvpmodeldemo.mvp.view;

import com.example.mvpmodeldemo.mvp.bean.User;

/**
 * Created by wlgbsj on 2017/3/2.
 */

public interface IUserLoginView {

    String getUserName();

    String getPassword();

    void clearUserName();

    void clearPassword();

    void showLoading();

    void hideLoading();

    void toMainActivity(User user);

    void showFailedError();
}
