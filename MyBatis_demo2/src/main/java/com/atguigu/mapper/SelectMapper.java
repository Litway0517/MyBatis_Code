package com.atguigu.mapper;

import com.atguigu.entity.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SelectMapper {

    // 根据id查询用户信息
    User getUserById(@Param("userId") Integer id);

    // 查询所有用户
    List<User> findAllUser();

    // 查询特殊字段 -> user表的总记录数
    Integer getCount();


}
