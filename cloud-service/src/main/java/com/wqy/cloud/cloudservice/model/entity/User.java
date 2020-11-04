package com.wqy.cloud.cloudservice.model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * 测试用用户实体类
 *
 * @author wqy
 * @version 1.0 2020/10/9
 */

@Entity
@Table(name = "user_tbl")
public class User extends BaseEntity {

    //编号
    private int number;

    //姓名
    private String name;

    //年龄
    private int age;

    //性别
    private String gender;

    @Column(name = "number", nullable = false, length = 16)
    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Column(name = "name", nullable = false, unique = true, length = 16)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Column(name = "age", length = 16)
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Column(name = "gender", length = 16)
    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
