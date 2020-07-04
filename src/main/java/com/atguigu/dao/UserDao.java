package com.atguigu.dao;

import com.atguigu.domain.User;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author guoyuan
 * @create 2020-07-01 20:22
 */
//@Mapper   //接口代理对象由 mybatis 管理
@Repository//接口代理对象由 spring ioc 管理 配合@MapperScan("com.atguigu.dao")使用
public interface UserDao {
    public List<User> findAll();
}
