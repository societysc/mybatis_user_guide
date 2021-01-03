package com.staticzz.dao;

import com.staticzz.entity.Student;
import com.staticzz.entity.Teacher;

import java.util.List;

public interface StudentDao {

    public List<Student> students();

    public List<Student> students2();

    public Teacher teacher();

}
