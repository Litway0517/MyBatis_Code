package com.atguigu.mapper;

import com.atguigu.domain.Dept;
import org.apache.ibatis.annotations.Param;

public interface DeptMapper {

    /*
        分步查询第二步
     */
    Dept getEmpAndDeptByStepTwo(@Param("dId") Integer dId);
}
