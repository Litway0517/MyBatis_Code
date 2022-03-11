package com.atguigu.mapper;

import com.atguigu.domain.Employee;
import com.atguigu.util.SqlSessionUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class EmployeeMapperTest {

    @Test
    public void getEmployeeAndDeptByStep() {
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        assert sqlSession != null;
        EmployeeMapper employeeMapper = sqlSession.getMapper(EmployeeMapper.class);
        Employee employee = employeeMapper.getEmployeeAndDeptByStepOne(1);
        System.out.println(employee);
    }

    @Test
    public void getEmployeeByAssociation() {
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        assert sqlSession != null;
        EmployeeMapper employeeMapper = sqlSession.getMapper(EmployeeMapper.class);
        Employee employee = employeeMapper.getEmployeeByIdAssociation(1);
        System.out.println(employee);
    }

    @Test
    public void getEmployeeById() {
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        assert sqlSession != null;
        EmployeeMapper employeeMapper = sqlSession.getMapper(EmployeeMapper.class);
        Employee employee = employeeMapper.getEmployeeById(1);
        System.out.println(employee);
    }

    @Test
    public void getAllEmployeeNew() {
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        assert sqlSession != null;
        EmployeeMapper employeeMapper = sqlSession.getMapper(EmployeeMapper.class);
        List<Employee> allEmployeeNew = employeeMapper.getAllEmployeeNew();
        allEmployeeNew.forEach(System.out::println);
    }

    @Test
    public void getAllEmployee() {
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        assert sqlSession != null;
        EmployeeMapper employeeMapper = sqlSession.getMapper(EmployeeMapper.class);
        List<Employee> employeeList = employeeMapper.getAllEmployee();
        System.out.println(employeeList);
    }
}
