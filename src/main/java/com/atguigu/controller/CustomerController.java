package com.atguigu.controller;

import com.atguigu.domain.Customer;
import com.atguigu.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author guoyuan
 * @create 2020-07-03 9:37
 */
@RestController
@RequestMapping("/customer")
public class CustomerController {

    @Autowired
    CustomerService customerService;

    @GetMapping("/findAll")
    public List<Customer> findAll(){
        return customerService.findCustomers();
    }

    @RequestMapping("/saveCustomer")
    public void saveCustomer(Customer customer){
        customerService.saveCustomer(customer);
    }

    @GetMapping("/updateCustomer")
    public void updateCustomer(Customer customer){
        customerService.updateCustomer(customer);
    }

    @GetMapping("/deleteCustomerById/{id}")
    public void deleteCustomer(Integer id){
        customerService.deleteCustomerById(id);
    }


}
