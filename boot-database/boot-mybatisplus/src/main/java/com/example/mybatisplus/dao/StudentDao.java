package com.example.mybatisplus.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.mybatisplus.entity.Student;
import org.apache.ibatis.annotations.Mapper;

/**
 * 学生Mapper 接口
 *
 * @author gu
 * @date 2022-05-20
 */
@Mapper
public interface StudentDao extends BaseMapper<Student> {


}
