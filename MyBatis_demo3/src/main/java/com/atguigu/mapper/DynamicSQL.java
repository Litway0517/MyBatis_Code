package com.atguigu.mapper;

import com.atguigu.domain.Employee;

import java.util.List;

public interface DynamicSQL {

    // 多条件查询
    List<Employee> getEmployeeByCondition(Employee employee);

    // 多条件查询 -> where标签
    List<Employee> getEmployeeByConditionTwo(Employee employee);

    // 多条件查询 -> trim标签1
    List<Employee> getEmployeeByConditionThree(Employee employee);



}
