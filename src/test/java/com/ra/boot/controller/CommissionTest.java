package com.ra.boot.controller;

import com.ra.boot.entity.CommissionEntity;
import com.ra.boot.mapper.CommissionMapper;
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
public class CommissionTest {

    @Autowired
    public CommissionMapper commissionMapper;

    @Test
    public void getEntity(){

        List commission = commissionMapper.getCommission();

        log.info("查询数据中"+commission);
    }

    @Test
    public void saveEntity(){

        CommissionEntity commissionEntity = new CommissionEntity();
        commissionEntity.setEmployeeId(1);
        commissionEntity.setProductId(1);
        commissionEntity.setCusumeNum(1);
        commissionEntity.setRate(0.2f);
        commissionEntity.setRate(100);

        int num = commissionMapper.insertCommission(commissionEntity);

        log.info("插入数据中"+num);
    }
}
