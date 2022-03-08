package com.atguigu.mapper;

import com.atguigu.entity.User;
import org.apache.ibatis.annotations.MapKey;
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

    // 第一种方式: 查询所有数据 -> 存储到Map类型的List集合来接收
    List<Map<String, Object>> getAllUserToMap();

    /*
        第二种方式: 查询所有的user用户. 需要使用@MapKey()注解
        @MapKey("查询结果列中的某一个字段的名字")
        MapKey("id"): 是指使用查询出来的结果字段中的id作为键, 然后对应该id的整条结果作为值存储到Map中.
        因此这个字段一定要保证唯一. 基本上就是主键. 如果不是唯一的结果, 那么会形成覆盖而不会报错.
        Map<注解值, 查询出来的结果>
     */
    @MapKey("id")
    // @MapKey("username")
    Map<String, Object> getAllUserToMapByMapkey();


}
