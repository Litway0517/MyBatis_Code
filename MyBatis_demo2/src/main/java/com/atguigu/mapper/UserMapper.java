package com.atguigu.mapper;

import com.atguigu.entity.User;

import java.util.List;

/**
 * 用户映射器
 *
 * @author DELL_
 * @date 2022/03/07
 */
public interface UserMapper {

    /**
     * 找到所有
     *
     * @return {@link List}<{@link User}>
     */
    public List<User> findAll();


}
