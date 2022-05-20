package com.example.mybatisplus.biz.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.mybatisplus.biz.StudentBiz;
import com.example.mybatisplus.dao.StudentDao;
import com.example.mybatisplus.entity.Student;
import org.springframework.stereotype.Service;

/**
 * 学生表bizImpl
 *
 * @author gu
 * @date 2022-05-20
 */
@Service
public class StudentBizImpl extends ServiceImpl<StudentDao, Student> implements StudentBiz {

}
