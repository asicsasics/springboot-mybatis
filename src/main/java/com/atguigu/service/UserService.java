package com.atguigu.service;

import com.atguigu.domain.User;

import java.util.List;

/**
 * @author guoyuan
 * @create 2020-07-01 20:27
 */
public interface UserService {
    List<User> findAll();
}
