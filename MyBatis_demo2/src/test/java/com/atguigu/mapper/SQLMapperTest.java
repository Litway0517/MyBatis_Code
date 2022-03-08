package com.atguigu.mapper;

import com.atguigu.entity.User;
import com.atguigu.utils.SqlSessionUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class SQLMapperTest {

    @Test
    public void getUserByLike() {
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        assert sqlSession != null;
        SQLMapper sqlMapper = sqlSession.getMapper(SQLMapper.class);
        List<User> userList = sqlMapper.getUserByLike("admin");
        System.out.println(userList);
    }
}
