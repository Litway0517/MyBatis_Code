package com.atguigu.mapper;

import com.atguigu.entity.User;
import com.atguigu.utils.SqlSessionUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class SQLMapperTest {

    @Test
    public void getUserByTableName() {
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        assert sqlSession != null;
        SQLMapper sqlMapper = sqlSession.getMapper(SQLMapper.class);
        List<User> t_user = sqlMapper.getUserByTableName("t_user");
        System.out.println(t_user);
    }

    @Test
    public void deleteMore() {
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        assert sqlSession != null;
        SQLMapper sqlMapper = sqlSession.getMapper(SQLMapper.class);
        int i = sqlMapper.deleteMore("1, 2, 3");
        System.out.println(i);
    }

    @Test
    public void getUserByLike() {
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        assert sqlSession != null;
        SQLMapper sqlMapper = sqlSession.getMapper(SQLMapper.class);
        List<User> userList = sqlMapper.getUserByLike("admin");
        System.out.println(userList);
    }
}
