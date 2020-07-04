package com.atguigu.service.impl;

import com.atguigu.dao.UserDao;
import com.atguigu.domain.User;
import com.atguigu.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author guoyuan
 * @create 2020-07-01 20:28
 */

@Service
public class UserServiceImpl implements UserService {

    //@Autowired  //spring中提供的
    @Resource  //jdk提供的,先byname，在bytype
    UserDao userDao;

    @Override
    public List<User> findAll() {
        return userDao.findAll();
    }
}
