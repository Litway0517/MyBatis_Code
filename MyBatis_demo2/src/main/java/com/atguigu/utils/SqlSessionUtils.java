package com.atguigu.utils;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

public class SqlSessionUtils {

    public static SqlSession getSqlSession() {
        InputStream resourceAsStream = null;
        try {
            resourceAsStream = Resources.getResourceAsStream("mybatis-config.xml");
            SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(resourceAsStream);
            return sqlSessionFactory.openSession(true);
        } catch (IOException e) {
            System.out.println("获取 MyBatis 核心配置文件失败 -> 请检查 ");
            return null;
        }
    }



}
