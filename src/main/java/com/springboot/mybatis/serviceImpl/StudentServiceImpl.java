package com.springboot.mybatis.serviceImpl;

import com.springboot.mybatis.mapper.StudentMapper;
import com.springboot.mybatis.model.Student;
import com.springboot.mybatis.service.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/******************************
 * @author : liuyang
 * <p>ProjectName:01-springboot-mybatis  </p>
 * @ClassName :  StudentServiceImpl
 * @date : 2018/7/8 0008
 * @time : 5:11
 * @createTime 2018-07-08 5:11
 * @version : 2.0
 * @description :
 *
 *
 *
 *******************************/

@Service
public class StudentServiceImpl implements IStudentService {

    @Autowired
    private StudentMapper studentMapper;

    @Override
    public List<Student> selectAllStudent() {
        return studentMapper.selectAllStudent();
    }
}
