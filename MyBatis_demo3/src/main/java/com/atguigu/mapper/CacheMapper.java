package com.atguigu.mapper;

import com.atguigu.domain.Employee;
import org.apache.ibatis.annotations.Param;

public interface CacheMapper {

    // 根据id查询员工信息
    Employee getEmployeeById(@Param(("eId")) Integer eId);

    // 新增一个插入方法, 用来测试mybatis的一级缓存
    int insertEmployee(Employee employee);


}
