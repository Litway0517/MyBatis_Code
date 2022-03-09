package com.atguigu.mapper;

import com.atguigu.entity.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SQLMapper {

    // 根据用户名进行 模糊查询
    List<User> getUserByLike(@Param("username") String username);

    // 批量删除
    int deleteMore(@Param("ids") String ids);

    // 根据表明动态查询 -> 动态设置表名. 例如: 有很多张User表, 所对应的实体相同, 但是user表太大分表了, 所以要根据表名查询.
    List<User> getUserByTableName(@Param("tableName") String tableName);


}
