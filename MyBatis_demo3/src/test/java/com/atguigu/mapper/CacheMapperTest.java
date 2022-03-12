package com.atguigu.mapper;

import com.atguigu.domain.Employee;
import com.atguigu.util.SqlSessionUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class CacheMapperTest {

    @Test
    public void getEmployeeById2() {
        SqlSession sqlSession1 = SqlSessionUtils.getSqlSession();
        assert sqlSession1 != null;
        CacheMapper cacheMapper1 = sqlSession1.getMapper(CacheMapper.class);
        Employee employeeById = cacheMapper1.getEmployeeById(1);
        System.out.println(employeeById);

        // 更换了SqlSession之后就执行了两次SQL
        SqlSession sqlSession2 = SqlSessionUtils.getSqlSession();
        assert sqlSession2 != null;
        CacheMapper cacheMapper2 = sqlSession2.getMapper(CacheMapper.class);
        Employee employeeById2 = cacheMapper1.getEmployeeById(1);
        System.out.println(employeeById2);
    }

    @Test
    public void getEmployeeById() {
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        assert sqlSession != null;
        CacheMapper cacheMapper1 = sqlSession.getMapper(CacheMapper.class);
        Employee employeeById = cacheMapper1.getEmployeeById(1);
        System.out.println(employeeById);

        // 虽然查询两次 id=1 的员工信息, 但是只执行了一条SQL
        CacheMapper cacheMapper2 = sqlSession.getMapper(CacheMapper.class);
        Employee employeeById1 = cacheMapper2.getEmployeeById(1);
        System.out.println(employeeById1);
    }
}
