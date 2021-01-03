package com.staticzz.utils;


import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

public class MybatisUtils {


    /**
     * 通过XML配置文件获取SqlSessionFactory实例
     * @return
     * @throws IOException
     */
    public SqlSessionFactory sqlSessionFactory() throws IOException {
        String resource = "mybatis/mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

        return  sqlSessionFactory;
    }


    /**
     * 通过SqlSessionFactory实例获取SqlSession对象
     * @return
     * @throws IOException
     */
    public SqlSession sqlSession() throws IOException {

        SqlSession sqlSession = sqlSessionFactory().openSession();

        return  sqlSession;
    }



}
