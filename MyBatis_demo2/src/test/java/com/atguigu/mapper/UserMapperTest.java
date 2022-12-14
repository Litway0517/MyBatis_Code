package com.atguigu.mapper;

import com.atguigu.entity.User;
import com.atguigu.utils.SqlSessionUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.HashMap;
import java.util.List;

import static org.junit.Assert.*;

public class UserMapperTest {


    @Test
    public void checkRegister() {
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        assert sqlSession != null;
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User user = new User();
        user.setUsername("张三");
        user.setAge(10);
        User user1 = mapper.checkRegister(user);
        System.out.println(user1);
    }

    @Test
    public void checkLoginByParam() {
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        assert sqlSession != null;
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        // 使用@Param("xxx")注解方式
        User user1 = mapper.checkLoginByParam("张三", "admin");
        System.out.println(user1);
    }

    @Test
    public void checkLogin2() {
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        assert sqlSession != null;
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);

        HashMap<String, Object> map = new HashMap<>();
        map.put("username", "张三");
        map.put("password", "admin");

        // 使用map方式
        User user = mapper.checkLogin(map);
        System.out.println(user);
    }

    @Test
    public void checkLogin() {
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        assert sqlSession != null;
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User litway = mapper.getUserByUsernameAndPassword("张三", "admin");
        System.out.println(litway);
    }

    @Test
    public void getUserByUsername() {
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        assert sqlSession != null;
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        // select * from `t_user` where `username` = ? (BaseJdbcLogger.java:137)
        User litway = mapper.getUserByUsername("张三");
        System.out.println(litway);

        User user = mapper.getUserByUsername2("张三");
        // select * from `t_user` where `username` = '张三' (BaseJdbcLogger.java:137)
        System.out.println(user);

    }

    @Test
    public void findAll() {
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        assert sqlSession != null;
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        List<User> all = mapper.findAll();
        all.forEach(System.out::println);
    }
}
