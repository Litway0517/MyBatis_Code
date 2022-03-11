package com.atguigu.mapper;

import com.atguigu.domain.Employee;

import java.util.List;

public interface DynamicSQL {

    // 多条件查询
    List<Employee> getEmployeeByCondition(Employee employee);



}
