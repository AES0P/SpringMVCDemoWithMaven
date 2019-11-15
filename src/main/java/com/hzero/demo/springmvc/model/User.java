package com.hzero.demo.springmvc.model;

/**
 * POJO user类
 */
public class User {

    private String name;
    private String password;

    public User() {
    }

    public User(String name, String password) {
        this.password = password;
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


    public String toString() {
        return "name:" + this.name + ",password:" + this.password;
    }
}
