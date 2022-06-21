package com.ra.boot.controller;

import com.ra.boot.entity.CusumeEntity;
import com.ra.boot.mapper.CusumeMapper;
import lombok.extern.slf4j.Slf4j;
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
public class CusumeTest {

    @Autowired
    public CusumeMapper cusumeMapper;

    @Test
    public void getEntity(){

        List cusume = cusumeMapper.getCusume();

        log.info("查询数据中"+cusume);
    }

    @Test
    public void saveEntity(){

        CusumeEntity cusumeEntity = new CusumeEntity();
        cusumeEntity.setCusumeDate(new Date());
        cusumeEntity.setEmployeeId(1);
        cusumeEntity.setEmployeeType(1);
        cusumeEntity.setProductId(1);
        cusumeEntity.setCusumeNum(1);
        cusumeEntity.setCusumePicsId("1");

        int num = cusumeMapper.insertCusume(cusumeEntity);

        log.info("插入数据中"+num);
    }
}
