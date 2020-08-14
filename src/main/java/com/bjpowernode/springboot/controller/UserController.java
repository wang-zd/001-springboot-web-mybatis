package com.bjpowernode.springboot.controller;

import com.bjpowernode.springboot.model.Student;
import com.bjpowernode.springboot.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Author 王振铎
 * @Date 2020/8/10 18:35
 */
@Controller
public class UserController {

    @Autowired
    private StudentService studentService;

    @RequestMapping("/user")
    public String queryStudent(Integer id, Model model) {
        Student student = studentService.queryStudentById(id);
        model.addAttribute("student", student);
        return "view";
    }
}
