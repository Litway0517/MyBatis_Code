package com.litway.mapper;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;

import static org.junit.Assert.*;

public class UserMapperTest {

    @Test
    public void insertUser() throws IOException {
        // 读取mybatis核心配置文件
        InputStream is = Resources.getResourceAsStream("mybatis-config.xml");
        // 新建一个sqlSession工厂实体
        SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
        // 调用工厂获取一个sqlSession
        SqlSessionFactory sqlSessionFactory = sqlSessionFactoryBuilder.build(is);
        // 通过工厂来获取连接
        SqlSession sqlSession = sqlSessionFactory.openSession();

        // 获取接口对象 -> 反射!
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        System.out.println(mapper.insertUser());

        // sqlSession默认不提交数据
        sqlSession.commit();
        // 关闭连接
        sqlSession.close();

    }
}
