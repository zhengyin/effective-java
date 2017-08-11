package com.izhengyin.effective.java.chapter4.item13.login;

/**
 * Created by zhengyin on 2017/8/11 下午2:17.
 * Email  <zhengyin.name@gmail.com> .
 */
public class ApiService implements Api {
    @Override
    public boolean login(String loginName, String loginPass) {
        SafeManager safeManager = new SafeManager();
        if(!safeManager.check(loginName)){
            return false;
        }
        AccountManager accountManager = new AccountManager();
        User user = accountManager.getAccount(loginName, loginPass);
        if(user != null){
            return true;
        }
        return false;
    }
}
