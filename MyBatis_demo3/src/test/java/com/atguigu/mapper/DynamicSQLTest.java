package com.atguigu.mapper;

import com.atguigu.domain.Employee;
import com.atguigu.util.SqlSessionUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class DynamicSQLTest {

    @Test
    public void testCleanCache() {
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        assert sqlSession != null;
        DynamicSQL dynamicSQL1 = sqlSession.getMapper(DynamicSQL.class);
        List<Employee> employee = dynamicSQL1.getEmployeeByCondition(new Employee(null, "张三", null, "", ""));
        System.out.println(employee);

        // 手动清空缓存 -> 清空一级
        sqlSession.clearCache();

        DynamicSQL dynamicSQL2 = sqlSession.getMapper(DynamicSQL.class);
        List<Employee> condition = dynamicSQL2.getEmployeeByCondition(new Employee(null, "张三", null, "", ""));
        System.out.println(condition);
    }

    @Test
    public void testCache() {
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        assert sqlSession != null;
        DynamicSQL dynamicSQL1 = sqlSession.getMapper(DynamicSQL.class);
        List<Employee> employee = dynamicSQL1.getEmployeeByCondition(new Employee(null, "张三", null, "", ""));
        System.out.println(employee);

        // 执行一次新增操作
        dynamicSQL1.insertEmployee(new Employee(null, "lit", 98, "男", "lit@163.com"));

        DynamicSQL dynamicSQL2 = sqlSession.getMapper(DynamicSQL.class);
        List<Employee> condition = dynamicSQL2.getEmployeeByCondition(new Employee(null, "张三", null, "", ""));
        System.out.println(condition);
    }

    @Test
    public void insertEmployees() {
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        assert sqlSession != null;
        DynamicSQL dynamicSQL = sqlSession.getMapper(DynamicSQL.class);
        Employee employee1 = new Employee(null, "a1", 23, "男", "a1@qq.com");
        Employee employee2 = new Employee(null, "a2", 24, "男", "a1@qq.com");
        Employee employee3 = new Employee(null, "a3", 25, "男", "a1@qq.com");
        List<Employee> employees = Arrays.asList(employee1, employee2, employee3);
        int i = dynamicSQL.insertEmployees(employees);
        System.out.println(i);
    }

    @Test
    public void deleteEmployeeByIdsTwo() {
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        assert sqlSession != null;
        DynamicSQL dynamicSQL = sqlSession.getMapper(DynamicSQL.class);
        int i = dynamicSQL.deleteEmployeeByIdsTwo(new Integer[]{6, 7, 8});
        System.out.println(i);
    }

    @Test
    public void deleteEmployeeByIds() {
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        assert sqlSession != null;
        DynamicSQL dynamicSQL = sqlSession.getMapper(DynamicSQL.class);
        int i = dynamicSQL.deleteEmployeeByIds(new Integer[]{6, 7, 8});
        System.out.println(i);
    }

    @Test
    public void getEmployeeByChoose() {
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        assert sqlSession != null;
        DynamicSQL dynamicSQL = sqlSession.getMapper(DynamicSQL.class);
        Employee employee = new Employee(null, "", null, "", "");
        List<Employee> employeeList = dynamicSQL.getEmployeeByChoose(employee);
        System.out.println(employeeList);
    }

    @Test
    public void getEmployeeByConditionFourth() {
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        assert sqlSession != null;
        DynamicSQL dynamicSQL = sqlSession.getMapper(DynamicSQL.class);
        Employee employee = new Employee(null, "张三", null, "", "");
        List<Employee> employeeList = dynamicSQL.getEmployeeByConditionFourth(employee);
        System.out.println(employeeList);
    }

    @Test
    public void getEmployeeByConditionThree() {
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        assert sqlSession != null;
        DynamicSQL dynamicSQL = sqlSession.getMapper(DynamicSQL.class);
        Employee employee = new Employee(null, "", null, "", "");
        List<Employee> employeeList = dynamicSQL.getEmployeeByConditionThree(employee);
        System.out.println(employeeList);

    }

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
