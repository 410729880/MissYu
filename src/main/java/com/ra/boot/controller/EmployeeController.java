package com.ra.boot.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.ra.boot.entity.EmployeeEntity;
import com.ra.boot.mapper.EmployeeMapper;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang.StringEscapeUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Slf4j
@RestController
public class EmployeeController {

    @Autowired
    private EmployeeMapper employeeMapper;

    @RequestMapping("/getEmployee")
    public String getEmployee(){

        List<EmployeeEntity> employeeList = employeeMapper.getEmployee();
        log.info("EmployeeController.getEmployee:"+employeeList);

        //获取的list转换为Json字符串，但是日期类型转化成了时间戳
//        String data = JSON.toJSONString(employeeList);

        //获取的list转换为Json字符串，并且强调日期类型不能转化为时间戳
        String data = JSON.toJSONStringWithDateFormat(employeeList,"yyyy-MM-dd").toString();

        Map<String,Object> map = new HashMap<>();

        JSONObject jsonObject = new JSONObject(map);
        jsonObject.put("code",0);
        jsonObject.put("msg","");
        jsonObject.put("count",9);
        jsonObject.put("data",data);

        //去除转义字符
        data = StringEscapeUtils.unescapeJavaScript(jsonObject.toString());

        //去除中括号前后的双引号
        data = data.replace(":\"[", ":[").replace("]\"","]");

        return data;
    }

    @RequestMapping("/addEmployee")
    public Map addEmployee(@RequestParam Map employeeMap){
        log.info(employeeMap.toString());
        Map map = new HashMap();
        EmployeeEntity employeeEntity = new EmployeeEntity();

        try {
            String employeeHiredate = employeeMap.get("employeeHiredate").toString();
            Date date = new SimpleDateFormat("yyyy-MM-dd").parse(employeeHiredate);

            employeeEntity.setEmployeeName(employeeMap.get("employeeName").toString());
            employeeEntity.setEmployeeAge(Integer.parseInt(employeeMap.get("employeeAge").toString()));
            employeeEntity.setEmployeeDepartment(employeeMap.get("employeeDepartment").toString());
//            employeeEntity.setEmployeeHiredate(new SimpleDateFormat("yyyy-MM-dd").format(employeeHiredate));
            employeeEntity.setEmployeeUpId(Integer.parseInt(employeeMap.get("employeeUpId").toString()));
            employeeEntity.setEmployeeLevel(Integer.parseInt(employeeMap.get("employeeLevel").toString()));
            employeeEntity.setEmployeeProvince(employeeMap.get("employeeProvince").toString());
            employeeEntity.setEmployeeCity(employeeMap.get("employeeCity").toString());
            employeeEntity.setEmployeeCounty(employeeMap.get("employeeCounty").toString());
            employeeEntity.setEmployeePhone(employeeMap.get("employeePhone").toString());
            employeeEntity.setEmployeePhoneContact(employeeMap.get("employeePhoneContact").toString());
            employeeEntity.setEmployeePic(employeeMap.get("employeePic").toString());
            employeeEntity.setEmployeeContent(employeeMap.get("employeeContent").toString());
        }catch (Exception e){
            log.info(e.toString());
            map.put("code",1);
            map.put("msg","非法操作，请刷新页面重试");
            return map;
        }

        try {
            int num = employeeMapper.addEmployee(employeeEntity);
            if(num > 0){
                map.put("code",0);
            }else{
                map.put("code",1);
                map.put("msg","插入失败，请重试");
            }
        }catch (Exception e){
            map.put("code",1);
            map.put("msg",e.getMessage());
        }

        return map;
    }
}
