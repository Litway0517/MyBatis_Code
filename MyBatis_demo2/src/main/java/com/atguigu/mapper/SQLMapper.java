package com.atguigu.mapper;

import com.atguigu.entity.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SQLMapper {

    // 根据用户名进行 模糊查询
    List<User> getUserByLike(@Param("username") String username);

    // 批量删除
    int deleteMore(@Param("ids") String ids);


}
