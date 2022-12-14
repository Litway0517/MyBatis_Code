package com.atguigu.mapper;

import com.atguigu.entity.User;
import com.atguigu.utils.SqlSessionUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class SelectMapperTest {

    @Test
    public void getAllUserToMap() {
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        assert sqlSession != null;
        SelectMapper selectMapper = sqlSession.getMapper(SelectMapper.class);
        // org.apache.ibatis.exceptions.TooManyResultsException
        System.out.println("方式1 -> " + selectMapper.getAllUserToMap());

        System.out.println("方式2 -> " + selectMapper.getAllUserToMapByMapkey());
    }

    @Test
    public void getUserByIdToMap() {
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        assert sqlSession != null;
        SelectMapper selectMapper = sqlSession.getMapper(SelectMapper.class);
        System.out.println(selectMapper.getUserByIdToMap(3));
    }

    @Test
    public void getCount() {
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        assert sqlSession != null;
        SelectMapper selectMapper = sqlSession.getMapper(SelectMapper.class);
        System.out.println(selectMapper.getCount());
    }

    @Test
    public void findAll() {
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        assert sqlSession != null;
        SelectMapper selectMapper = sqlSession.getMapper(SelectMapper.class);
        List<User> allUser = selectMapper.findAllUser();
        allUser.forEach(System.out::println);
    }

    @Test
    public void getUserById() {
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        assert sqlSession != null;
        SelectMapper selectMapper = sqlSession.getMapper(SelectMapper.class);
        User user = selectMapper.getUserById(3);
        System.out.println(user);
    }
}
