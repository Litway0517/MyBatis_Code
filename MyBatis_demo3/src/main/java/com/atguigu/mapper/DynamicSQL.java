package com.atguigu.mapper;

import com.atguigu.domain.Employee;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface DynamicSQL {

    // 多条件查询
    List<Employee> getEmployeeByCondition(Employee employee);

    // 多条件查询 -> where标签
    List<Employee> getEmployeeByConditionTwo(Employee employee);

    // 多条件查询 -> trim标签1
    List<Employee> getEmployeeByConditionThree(Employee employee);

    // 多条件查询 -> trim标签2
    List<Employee> getEmployeeByConditionFourth(Employee employee);

    // 多条件查询 -> choose标签
    List<Employee> getEmployeeByChoose(Employee employee);

    // 批量删除 -> foreach标签. 通过整型数组进行批量删除1
    int deleteEmployeeByIds(@Param("eIds") Integer[] eIds);

    // 批量删除 -> foreach标签. 通过整型数组进行批量删除2
    int deleteEmployeeByIdsTwo(@Param("eIds") Integer[] eIds);

    // 批量插入 -> collection标签.
    int insertEmployees(@Param("employeeList") List<Employee> employeeList);



}
