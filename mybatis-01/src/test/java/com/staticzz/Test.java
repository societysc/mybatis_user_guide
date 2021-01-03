package com.staticzz;

import com.staticzz.dao.StudentDao;
import com.staticzz.dao.UserDao;
import com.staticzz.entity.Student;
import com.staticzz.entity.Teacher;
import com.staticzz.entity.User;
import com.staticzz.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;

import java.io.IOException;
import java.util.List;

public class Test {


    @org.junit.Test
    public void SqlSessionTest() throws IOException {
        MybatisUtils mybatisUtils = new MybatisUtils();

        SqlSession sqlSession = mybatisUtils.sqlSession();

        UserDao mapper = sqlSession.getMapper(UserDao.class);

        List<User> query = mapper.query();

        System.out.println(query);

    }

    @org.junit.Test
    public  void  queryByID() throws IOException {
        MybatisUtils mybatisUtils = new MybatisUtils();

        SqlSession sqlSession = mybatisUtils.sqlSession();

        UserDao mapper = sqlSession.getMapper(UserDao.class);

        User user = mapper.queryByID(22);

        System.out.println(user);

        sqlSession.close();
    }


    /**
     * 根据查询嵌套测试
     * @throws IOException
     */
    @org.junit.Test
    public void students() throws IOException {
        MybatisUtils mybatisUtils = new MybatisUtils();

        SqlSession sqlSession = mybatisUtils.sqlSession();


        StudentDao mapper = sqlSession.getMapper(StudentDao.class);

        List<Student> students = mapper.students();

        System.out.println(students);

        sqlSession.close();
    }


    /**
     * 根据结果嵌套测试
     * @throws IOException
     */
    @org.junit.Test
    public void students1() throws IOException {
        MybatisUtils mybatisUtils = new MybatisUtils();

        SqlSession sqlSession = mybatisUtils.sqlSession();


        StudentDao mapper = sqlSession.getMapper(StudentDao.class);

        List<Student> students = mapper.students2();

        System.out.println(students);

        sqlSession.close();
    }







    @org.junit.Test
    public  void teachers() throws IOException {
        MybatisUtils mybatisUtils = new MybatisUtils();

        SqlSession sqlSession = mybatisUtils.sqlSession();


        StudentDao mapper = sqlSession.getMapper(StudentDao.class);

        Teacher teacher = mapper.teacher();

        System.out.println(teacher);

        sqlSession.close();

    }

}
