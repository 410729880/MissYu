package com.ra.boot.controller;

import com.ra.boot.entity.DepartmentEntity;
import com.ra.boot.mapper.DepartmentMapper;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;


@Slf4j
@RunWith(SpringRunner.class)
@SpringBootTest
public class DepartmentTest {

    @Autowired
    public DepartmentMapper departmentMapper;

    @Test
    public void getEntity(){

        List department = departmentMapper.getDepartment();

        log.info("查询数据中"+department);
    }

    @Test
    public void saveEntity(){

        DepartmentEntity departmentEntity = new DepartmentEntity();
        departmentEntity.setDepartmentName("摸鱼部");
        departmentEntity.setDepartmentContent("这是摸鱼高手");

        int num = departmentMapper.insertDepartment(departmentEntity);

        log.info("插入数据中"+num);
    }
}
