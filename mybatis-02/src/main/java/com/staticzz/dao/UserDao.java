package com.staticzz.dao;

import com.staticzz.entity.User;

import java.util.List;


public interface UserDao {

    public List<User> query();

    public  User queryByID(Integer id);
}
