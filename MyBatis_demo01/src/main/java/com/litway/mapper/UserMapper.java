package com.litway.mapper;

import com.litway.entity.User;

import java.util.List;

/**
 * 用户映射器
 *
 * @author DELL_
 * @date 2022/03/06
 */
public interface UserMapper {

    /**
     * 插入用户
     *
     * @return int
     */
    public int insertUser();

    /**
     * 更新用户
     *
     * @return int
     */
    public int updateUser();

    /**
     * 删除用户
     *
     * @return int
     */
    public int deleteUser();

    /**
     * 得到用户id
     *
     * @return {@link User}
     */
    public User getUserById();

    /**
     * 找到所有
     *
     * @return {@link List}<{@link User}>
     */
    public List<User> findAll();



}
