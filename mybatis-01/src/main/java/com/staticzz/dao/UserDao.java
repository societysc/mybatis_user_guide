package com.staticzz.dao;

import com.staticzz.entity.User;
import com.staticzz.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;

import java.io.IOException;
import java.util.List;


public interface UserDao {

    public List<User> query();

    public  User queryByID(Integer id);
}
