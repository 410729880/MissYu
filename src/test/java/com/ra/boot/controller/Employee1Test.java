package com.ra.boot.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.ra.boot.entity.EmployeeEntity;
import com.ra.boot.mapper.EmployeeMapper;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang.StringEscapeUtils;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


@Slf4j
@RunWith(SpringRunner.class)
@SpringBootTest
public class Employee1Test {

    @Autowired
    public EmployeeMapper employeeMapper;

    @Test
    public void getEntity(){

        List<EmployeeEntity> employeeList = employeeMapper.getEmployee();
        log.info("EmployeeController.getEmployee:"+employeeList);

        String data = JSON.toJSONString(employeeList);

        log.info("data-----:"+data);
        data = StringEscapeUtils.unescapeJavaScript(data);
        log.info("data-----:"+data);

        Map<String,Object> map = new HashMap<>();

        JSONObject jsonObject = new JSONObject(map);
        jsonObject.put("code",0);
        jsonObject.put("msg","");
        jsonObject.put("count",1000);
        jsonObject.put("data",data);
        log.info("jsonObject-----:"+jsonObject);

        data = StringEscapeUtils.unescapeJavaScript(jsonObject.toString());

        log.info("data-----:"+data);

        data = data.replace(":\"[", ":[").replace("]\"","]");

        System.out.println("去除左右中括号后:"+data);
    }

}
