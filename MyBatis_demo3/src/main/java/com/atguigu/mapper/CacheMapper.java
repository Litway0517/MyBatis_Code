package com.atguigu.mapper;

import com.atguigu.domain.Employee;
import org.apache.ibatis.annotations.Param;

public interface CacheMapper {

    // 根据id查询员工信息
    Employee getEmployeeById(@Param(("eId")) Integer eId);


}
