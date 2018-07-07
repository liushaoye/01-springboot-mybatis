package com.springboot.mybatis.service;

import com.springboot.mybatis.model.Student;

import java.util.List;

/******************************
 * @author : liuyang
 * <p>ProjectName:01-springboot-mybatis  </p>
 * @ClassName :  IStudentService
 * @date : 2018/7/8 0008
 * @time : 5:11
 * @createTime 2018-07-08 5:11
 * @version : 2.0
 * @description :
 *
 *
 *
 *******************************/

public interface IStudentService {

    /**
     * 获取所有学生
     *
     * @return
     */
    List<Student> selectAllStudent();
}
