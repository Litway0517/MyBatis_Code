package com.atguigu.mapper;

import com.atguigu.entity.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SelectMapper {

    // 根据id查询用户信息
    public User getUserById(@Param("userId") Integer id);

    // 查询所有用户
    public List<User> findAllUser();


}
