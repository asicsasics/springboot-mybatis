package com.atguigu.dao;

import com.atguigu.domain.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.persistence.Id;

/**
 * 继承jpa规范接口，接口中已经规范好了CRUD方法
 */
public interface CustomerDao extends JpaRepository<Customer, Integer> {
}
