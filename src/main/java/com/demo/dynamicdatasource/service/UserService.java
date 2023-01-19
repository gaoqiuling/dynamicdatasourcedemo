package com.demo.dynamicdatasource.service;

import com.demo.dynamicdatasource.constant.DBConstants;
import com.demo.dynamicdatasource.mapper.UserMapper;
import com.baomidou.dynamic.datasource.annotation.DS;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserMapper userMapper;

    @DS(DBConstants.DATASOURCE_RUOYI)
    public void method01() {
        System.out.println(userMapper.getFirstUserId());
    }

    @DS(DBConstants.DATASOURCE_ZHIGOU)
    public void method02() {
        System.out.println(userMapper.getFirstUserId());
    }
}
