package com.ra.boot.mapper;

import com.ra.boot.entity.PicsEntity;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface PicsMapper {

    public List getPics();

    public int insertPics(PicsEntity picsEntity);

}