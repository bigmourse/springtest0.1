package com.xuan.entity;

import javax.annotation.sql.DataSourceDefinition;
import java.util.Objects;


public class UserEntity {
    private Integer id;
private String userName;
private Integer age;


    public UserEntity(Integer id, String userName, Integer age) {
        this.id = id;
        this.userName = userName;
        this.age = age;
    }

    public UserEntity(String userName, Integer age) {
        this.userName = userName;
        this.age = age;
    }

    public String getUserName() {
        return userName;
    }

    public Integer getAge() {
        return age;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserEntity that = (UserEntity) o;
        return id.equals(that.id) &&
                userName.equals(that.userName) &&
                age.equals(that.age);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, userName, age);
    }
}

