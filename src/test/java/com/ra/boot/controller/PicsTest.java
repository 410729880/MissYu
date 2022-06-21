package com.ra.boot.controller;

import com.ra.boot.entity.PicsEntity;
import com.ra.boot.mapper.PicsMapper;
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
public class PicsTest {

    @Autowired
    public PicsMapper picsMapper;

    @Test
    public void getEntity(){

        List pics = picsMapper.getPics();

        log.info("查询数据中"+pics);
    }

    @Test
    public void saveEntity(){

        PicsEntity picsEntity = new PicsEntity();
        picsEntity.setPicsId(1);
        picsEntity.setPic("/images/aa.png");

        int num = picsMapper.insertPics(picsEntity);

        log.info("插入数据中"+num);
    }
}
