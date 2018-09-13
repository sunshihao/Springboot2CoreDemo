package com.sssh.controller;



import com.sssh.mapper.TestMapper;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;


import javax.annotation.Resource;

/**
 * 单元测试类
 * */

@SpringBootTest(classes = TestMapper.class)
@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
public class TestMapperTest {

    @Resource
    private TestMapper testMapper;

    @Test
    public void version() {

        String version = testMapper.version();
        System.out.println(version);
        Assert.assertEquals("5.7.21", version);
    }
}
