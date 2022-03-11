package com.atguigu.mapper;

import com.atguigu.domain.Dept;
import org.apache.ibatis.annotations.Param;

public interface DeptMapper {

    /*
        分步查询第二步
     */
    Dept getEmpAndDeptByStepTwo(@Param("dId") Integer dId);

    // 查询部门及部门中的员工信息
    Dept getDeptAndEmployeeById(@Param("dId") Integer dId);

    // 根据部门id查询部门信息
    Dept getDeptAndEmployeeByStepOne(@Param("dId") Integer dId);
}
