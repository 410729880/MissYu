package com.ra.boot.controller;

import cn.hutool.json.JSONArray;
import cn.hutool.json.JSONObject;
import cn.hutool.json.JSONUtil;
import com.ra.boot.entity.EmployeeEntity;
import com.ra.boot.mapper.EmployeeMapper;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang.StringEscapeUtils;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;
import java.util.List;


@Slf4j
@RunWith(SpringRunner.class)
@SpringBootTest
public class EmployeeTest {

    @Autowired
    public EmployeeMapper employeeMapper;

    @Test
    public void getEntity(){

        List<EmployeeEntity> employeeList = employeeMapper.getEmployee();
        log.info("EmployeeController.getEmployee:"+employeeList);

        JSONArray jsonArray = JSONUtil.parseArray(employeeList);
        log.info(jsonArray.toString());
        String data = jsonArray.toString();

        JSONObject jsonObject = JSONUtil.createObj();
        jsonObject.accumulate("code",0);
        jsonObject.accumulate("msg","");
        jsonObject.accumulate("count",1000);
        jsonObject.accumulate("data",data);

        data = StringEscapeUtils.unescapeJavaScript(jsonObject.toString());
        log.info(data);

        data = data.replace(":\"[", ":[").replace("]\"","]");

        System.out.println("去除左右中括号后:"+data);
    }

    @Test
    public void addEntity(){

        EmployeeEntity employeeEntity = new EmployeeEntity();
        employeeEntity.setEmployeeName("麻子");
        employeeEntity.setEmployeeAge(12);
        employeeEntity.setEmployeeDepartment("技术部");
        employeeEntity.setEmployeeHiredate(new Date());
        employeeEntity.setEmployeeUpId(1);
        employeeEntity.setEmployeeLevel(1);
        employeeEntity.setEmployeeProvince("上海");
        employeeEntity.setEmployeeCity("上海");
        employeeEntity.setEmployeeCounty("闵行");
        employeeEntity.setEmployeePhone("18788887777");
        employeeEntity.setEmployeePhoneContact("111");
        employeeEntity.setEmployeePic("");
        employeeEntity.setEmployeeContent("111");

        int num = employeeMapper.addEmployee(employeeEntity);

        log.info("插入数据中"+num);
    }
}
