package com.atguigu.entity;

/**
 * 用户
 *
 * @author DELL_
 * @date 2022/03/05
 */
public class User {


    /**
     * id
     */
    private Integer id;
    /**
     * 用户名
     */
    private String username;
    /**
     * 密码
     */
    private String password;
    /**
     * 年龄
     */
    private Integer age;
    /**
     * 性
     */
    private String sex;
    /**
     * 电子邮件
     */
    private String email;
    /**
     * 德尔国旗
     */
    private String delFlag;

    /**
     * 用户
     */
    public User() {
    }

    /**
     * 用户
     *
     * @param id       id
     * @param username 用户名
     * @param password 密码
     * @param age      年龄
     * @param sex      性
     * @param email    电子邮件
     * @param delFlag  德尔国旗
     */
    public User(Integer id, String username, String password, Integer age, String sex, String email, String delFlag) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.age = age;
        this.sex = sex;
        this.email = email;
        this.delFlag = delFlag;
    }

    /**
     * 得到id
     *
     * @return {@link Integer}
     */
    public Integer getId() {
        return id;
    }

    /**
     * 组id
     *
     * @param id id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获得用户名
     *
     * @return {@link String}
     */
    public String getUsername() {
        return username;
    }

    /**
     * 设置用户名
     *
     * @param username 用户名
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * 得到密码
     *
     * @return {@link String}
     */
    public String getPassword() {
        return password;
    }

    /**
     * 设置密码
     *
     * @param password 密码
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * 让年龄
     *
     * @return {@link Integer}
     */
    public Integer getAge() {
        return age;
    }

    /**
     * 设定年龄
     *
     * @param age 年龄
     */
    public void setAge(Integer age) {
        this.age = age;
    }

    /**
     * 获得性
     *
     * @return {@link String}
     */
    public String getSex() {
        return sex;
    }

    /**
     * 集合性
     *
     * @param sex 性
     */
    public void setSex(String sex) {
        this.sex = sex;
    }

    /**
     * 获得电子邮件
     *
     * @return {@link String}
     */
    public String getEmail() {
        return email;
    }

    /**
     * 设置电子邮件
     *
     * @param email 电子邮件
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * 得到del国旗
     *
     * @return {@link String}
     */
    public String getDelFlag() {
        return delFlag;
    }

    /**
     * 设置del标志
     *
     * @param delFlag 德尔国旗
     */
    public void setDelFlag(String delFlag) {
        this.delFlag = delFlag;
    }

    /**
     * 字符串
     *
     * @return {@link String}
     */
    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                ", email='" + email + '\'' +
                ", delFlag='" + delFlag + '\'' +
                '}';
    }
}


