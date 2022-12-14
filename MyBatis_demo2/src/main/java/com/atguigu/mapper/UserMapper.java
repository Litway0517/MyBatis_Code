package com.atguigu.mapper;

import com.atguigu.entity.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

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

    public User getUserByUsername(String username);

    public User getUserByUsername2(String username);

    public User getUserByUsernameAndPassword(String username, String password);

    public User checkLogin(Map<String, Object> map);

    public User checkRegister(User user);

    public User checkLoginByParam(@Param("username") String username, @Param("password") String password);




}
