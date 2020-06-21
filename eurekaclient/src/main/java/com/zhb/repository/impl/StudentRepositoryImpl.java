package com.zhb.repository.impl;

import com.zhb.entity.Student;
import com.zhb.repository.StudentRepository;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 * @Author: 大冰
 * @Date: 2020/6/18 18:13
 */
@Repository
public class StudentRepositoryImpl implements StudentRepository {
    private static Map<Long,Student> studentMap;
    static {
        studentMap = new HashMap<>();
        studentMap.put(1L,new Student(1L,"张三",22));
        studentMap.put(2L,new Student(2L,"张二",25));
        studentMap.put(3L,new Student(3L,"张提",24));
    }


    @Override
    public Collection<Student> findAll() {
        return studentMap.values();
    }

    @Override
    public Student findById(long id) {
        return studentMap.get(id);
    }

    @Override
    public void saveOrUpdate(Student student) {
        studentMap.put(student.getId(),student);
    }

    @Override
    public void deleteById(long id) {
        studentMap.remove(id);
    }
}
