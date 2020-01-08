package com.mr.zh.entity;

import cn.afterturn.easypoi.excel.annotation.Excel;

public class DemoEntity {
    private Integer id;

    @Excel(name = "姓名", orderNum = "0", width = 15)
    private String name;
    @Excel(name = "性别", orderNum = "1", width = 15)
    private Integer sex;
    @Excel(name = "手机", orderNum = "2", width = 15)
    private String phonenumber;

    @Override
    public String toString() {
        return "DemoEntity{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", sex=" + sex +
                ", phonenumber='" + phonenumber + '\'' +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber == null ? null : phonenumber.trim();
    }
}