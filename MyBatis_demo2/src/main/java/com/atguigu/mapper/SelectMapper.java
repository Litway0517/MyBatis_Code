package com.atguigu.mapper;

import com.atguigu.entity.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface SelectMapper {

    // 根据id查询用户信息
    User getUserById(@Param("userId") Integer id);

    // 查询所有用户
    List<User> findAllUser();

    // 查询特殊字段 -> user表的总记录数
    Integer getCount();

    // 根据id查询用户 -> 返回为Map集合(如果有时候查询出来的结果没有一个实体能够接收, 那么就可以用Map对象接收)
    Map<String, Object> getUserByIdToMap(@Param("userId") Integer userId);


}
