package com.demo.dynamicdatasource.service;

import com.demo.dynamicdatasource.Application;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = Application.class)
public class UserServiceTest {
    @Autowired
    private UserService userService;
    @Test
    public void testMethod0() {
        System.out.println("开始查看切换数据源啦");
        userService.method01();
        userService.method02();
        System.out.println("查看切换数据源结束");
    }
}
