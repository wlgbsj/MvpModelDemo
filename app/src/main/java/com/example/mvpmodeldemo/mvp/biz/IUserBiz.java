package com.example.mvpmodeldemo.mvp.biz;

/**
 * Created by wlgbsj on 2017/3/2.
 */

public interface IUserBiz {
    public void login(String username, String password, OnLoginListener loginListener);
}
