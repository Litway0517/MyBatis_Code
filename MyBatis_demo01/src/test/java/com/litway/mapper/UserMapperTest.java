package com.litway.mapper;

import com.litway.entity.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import static org.junit.Assert.*;

public class UserMapperTest {

    @Test
    public void findAll() throws IOException {
        // 读取mybatis核心配置文件
        InputStream is = Resources.getResourceAsStream("mybatis-config.xml");
        // 新建一个sqlSession工厂实体
        SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
        // 调用工厂获取一个sqlSession
        SqlSessionFactory sqlSessionFactory = sqlSessionFactoryBuilder.build(is);
        // 通过工厂来获取连接 -> 自动提交
        SqlSession sqlSession = sqlSessionFactory.openSession(true);

        // 获取接口对象 -> 反射!
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        List<User> all = mapper.findAll();
        all.forEach(System.out::println);

        // 关闭连接
        sqlSession.close();
    }

    @Test
    public void getUserById() throws IOException {
        // 读取mybatis核心配置文件
        InputStream is = Resources.getResourceAsStream("mybatis-config.xml");
        // 新建一个sqlSession工厂实体
        SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
        // 调用工厂获取一个sqlSession
        SqlSessionFactory sqlSessionFactory = sqlSessionFactoryBuilder.build(is);
        // 通过工厂来获取连接 -> 自动提交
        SqlSession sqlSession = sqlSessionFactory.openSession(true);

        // 获取接口对象 -> 反射!
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        System.out.println(mapper.getUserById());

        // 关闭连接
        sqlSession.close();
    }

    @Test
    public void deleteUser() throws IOException {
        // 读取mybatis核心配置文件
        InputStream is = Resources.getResourceAsStream("mybatis-config.xml");
        // 新建一个sqlSession工厂实体
        SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
        // 调用工厂获取一个sqlSession
        SqlSessionFactory sqlSessionFactory = sqlSessionFactoryBuilder.build(is);
        // 通过工厂来获取连接 -> 自动提交
        SqlSession sqlSession = sqlSessionFactory.openSession(true);

        // 获取接口对象 -> 反射!
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        System.out.println(mapper.deleteUser());

        // 关闭连接
        sqlSession.close();
    }

    @Test
    public void updateUser() throws IOException {
        // 读取mybatis核心配置文件
        InputStream is = Resources.getResourceAsStream("mybatis-config.xml");
        // 新建一个sqlSession工厂实体
        SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
        // 调用工厂获取一个sqlSession
        SqlSessionFactory sqlSessionFactory = sqlSessionFactoryBuilder.build(is);
        // 通过工厂来获取连接 -> 自动提交
        SqlSession sqlSession = sqlSessionFactory.openSession(true);

        // 获取接口对象 -> 反射!
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        System.out.println(mapper.updateUser());

        // 关闭连接
        sqlSession.close();
    }

    @Test
    public void insertUser() throws IOException {
        // 读取mybatis核心配置文件
        InputStream is = Resources.getResourceAsStream("mybatis-config.xml");
        // 新建一个sqlSession工厂实体
        SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
        // 调用工厂获取一个sqlSession
        SqlSessionFactory sqlSessionFactory = sqlSessionFactoryBuilder.build(is);
        // 通过工厂来获取连接 -> 自动提交
        SqlSession sqlSession = sqlSessionFactory.openSession(true);

        // 获取接口对象 -> 反射!
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        System.out.println(mapper.insertUser());

        // sqlSession默认不提交数据
        sqlSession.commit();
        // 关闭连接
        sqlSession.close();

    }
}
