package com.staticzz.dao;

import com.staticzz.entity.Student;
import com.staticzz.entity.Teacher;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TeacherDao {

    public List<Teacher> teachers(@Param("id") int id);


    public List<Teacher> teachers2(@Param("id") int id);


    public Student student();

}
