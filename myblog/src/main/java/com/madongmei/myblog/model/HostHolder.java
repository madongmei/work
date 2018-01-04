package com.madongmei.myblog.model;

import org.springframework.stereotype.Component;

/**
 * Created by laxe on 2018/1/3.
 */
@Component
public class HostHolder {

    private static ThreadLocal<User> users=new ThreadLocal<>();

    public User getUser(){
        return users.get();
    }


    public void setUser(User user){
        users.set(user);
    }

    public void clear(){
        users.remove();
    }
}
