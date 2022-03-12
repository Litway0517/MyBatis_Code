package com.atguigu.mapper;

import com.atguigu.domain.Employee;
import com.atguigu.util.SqlSessionUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class DynamicSQLTest {

    @Test
    public void getEmployeeByConditionTwo() {
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        assert sqlSession != null;
        DynamicSQL dynamicSQL = sqlSession.getMapper(DynamicSQL.class);
        Employee employee = new Employee(null, "", null, "", "");
        List<Employee> employeeList = dynamicSQL.getEmployeeByConditionTwo(employee);
        System.out.println(employeeList);

    }

    @Test
    public void getEmployeeByCondition() {
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        assert sqlSession != null;
        DynamicSQL dynamicSQL = sqlSession.getMapper(DynamicSQL.class);
        Employee employee = new Employee(null, "张三", 25, "", "");
        List<Employee> employeeList = dynamicSQL.getEmployeeByCondition(employee);
        System.out.println(employeeList);

    }
}
