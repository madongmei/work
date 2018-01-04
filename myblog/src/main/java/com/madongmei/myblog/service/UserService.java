package com.madongmei.myblog.service;

import com.madongmei.myblog.dao.LoginTicketDao;
import com.madongmei.myblog.dao.UserDao;
import com.madongmei.myblog.model.LoginTicket;
import com.madongmei.myblog.model.User;
import com.madongmei.myblog.util.MyBlogUtil;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

/**
 * Created by laxe on 2018/1/3.
 */
@Service
public class UserService {
    @Autowired
    private UserDao userDao;

    @Autowired
    private LoginTicketDao loinTicketDao;

    public UserDao getUserDao() {
        return userDao;
    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public LoginTicketDao getLoinTicketDao() {
        return loinTicketDao;
    }

    public void setLoinTicketDao(LoginTicketDao loinTicketDao) {
        this.loinTicketDao = loinTicketDao;
    }


    /**
     * 用户注册
     * params:username,password
     *
     * */
    public Map<String,String> register(String username, String password){
        Map<String,String> map=new HashMap<String,String>();
        Random random=new Random();
        if(StringUtils.isBlank(username)){
            map.put("msg","用户名不能为空。");
            return map;
        }

        if(StringUtils.isBlank(password)){
            map.put("msg","密码不能为空。");
            return map;
        }

        User u=userDao.selectByName(username);
        if(u!=null){
            map.put("msg","y用户名已存在。");
            return map;
        }

        User user=new User();
        user.setName(username);
        user.setSalt(UUID.randomUUID().toString().substring(0,5));
        user.setHeadUrl(String.format("https://images.nowcoder.com/head/%dm.png",random.nextInt(1000)));
        user.setPassword(MyBlogUtil.MD5(password+user.getSalt()));
        user.setRole("user");
        userDao.insertUser(user);

        String ticket=addLoginTicket(user.getId());
        map.put("ticket",ticket);
        return map;
    }

    /**
     * 用户登录
     * params:username,password
     * */

    public Map<String,String> login(String username,String password){
        Map<String,String> map=new HashMap<String,String>();

        if(StringUtils.isBlank(username)){
            map.put("msg","用户名不能为空。");
            return map;
        }

        if(StringUtils.isBlank(password)){
            map.put("msg","密码不能为空。");
            return map;
        }

        User u=userDao.selectByName(username);
        if(u==null){
            map.put("msg","用户名不存在。");
            return map;
        }

        if(!MyBlogUtil.MD5(password+u.getSalt()).equals(u.getPassword())){
            map.put("msg","密码错误");
            return map;
        }

        String ticket=addLoginTicket(u.getId());
        map.put("ticket",ticket);
        return map;
    }

    public String addLoginTicket(int id){
        LoginTicket loginTicket=new LoginTicket();
        loginTicket.setUserId(id);
        Date date=new Date();
        date.setTime(date.getTime()+1000*3600*30);
        loginTicket.setExpired(date);
        loginTicket.setStatus(0);
        loginTicket.setTicket(UUID.randomUUID().toString().replaceAll("-",""));
        loinTicketDao.insertLoginTicket(loginTicket);

        return loginTicket.getTicket();
    }
}
