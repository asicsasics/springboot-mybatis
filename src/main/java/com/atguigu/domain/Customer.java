package com.atguigu.domain;


import javax.persistence.*;
import java.io.Serializable;

/**
 *实体类是用来表示数据的，需要序列化
 * JPA是Java Persistence API的简称
 */
@Entity
@Table(name = "customer")
public class Customer implements Serializable {

    @Id//生成主键
    @GeneratedValue(strategy = GenerationType.IDENTITY)//声明主键的生成方式（mysql）integer类型
    private Integer id;
    @Column(name = "username")//字段名称跟属性名称一样，可以省略不写，（orm映射）
    private String username;
    // 密码
    private String password;
    // 姓名
    private String name;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
