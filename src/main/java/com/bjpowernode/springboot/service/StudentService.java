package com.bjpowernode.springboot.service;

import com.bjpowernode.springboot.model.Student;
import org.springframework.stereotype.Service;

/**
 * @Author 王振铎
 * @Date 2020/8/10 18:39
 */

public interface StudentService {

    Student queryStudentById(Integer id);
}
