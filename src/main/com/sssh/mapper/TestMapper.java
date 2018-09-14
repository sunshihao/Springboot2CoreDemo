package com.sssh.mapper;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface TestMapper {
    /**
     * 返回数据库版本号
     * @return
     */
    String version();
}