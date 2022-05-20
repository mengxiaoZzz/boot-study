package com.example.mybatisplus.controller;

import com.example.mybatisplus.biz.StudentBiz;
import com.example.mybatisplus.entity.Student;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * 学生Controller
 *
 * @author gu
 * @date 2022-05-20
 */
@Slf4j
@RestController
@RequestMapping("/mybatis/student")
public class StudentController {

    @Resource
    private StudentBiz studentBiz;

    @GetMapping("/{id}")
    public String getName(@PathVariable("id") Integer id) {
        Student student = studentBiz.getById(id);
        return student.getName();
    }

}
