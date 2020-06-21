package com.zhb.repository;

import com.zhb.entity.Student;

import java.util.Collection;

/**
 * @Author: 大冰
 * @Date: 2020/6/18 18:11
 */
public interface StudentRepository {
    public Collection<Student> findAll();
    public Student findById(long id);
    public void saveOrUpdate(Student student);
    public void deleteById(long id);
}
