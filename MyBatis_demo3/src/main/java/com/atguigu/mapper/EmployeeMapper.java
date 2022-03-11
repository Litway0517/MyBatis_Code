package com.atguigu.mapper;

import com.atguigu.domain.Employee;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface EmployeeMapper {

    // 查询所有员工
    List<Employee> getAllEmployee();

    // 查询所有员工
    List<Employee> getAllEmployeeNew();

    // 查询员工及员工的部门信息
    Employee getEmployeeById(@Param("eId") Integer eId);

    // 使用association标签手动映射
    Employee getEmployeeByIdAssociation(@Param("eId") Integer eId);

    /*
        使用分布查询完成员工信息及其部门的查询
        第一步: 先查询员工信息
     */
    Employee getEmployeeAndDeptByStepOne(@Param("eId") Integer eId);


}
