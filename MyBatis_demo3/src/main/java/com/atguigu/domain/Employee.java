package com.atguigu.domain;

/**
 * 员工
 *
 * @author DELL_
 * @date 2022/03/09
 */
public class Employee {

    /**
     * e id
     */
    private Integer eId;
    /**
     * emp名字
     */
    private String empName;
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
     * 员工
     */
    public Employee() {
    }

    /**
     * 员工
     *
     * @param eId     e id
     * @param empName emp名字
     * @param age     年龄
     * @param sex     性
     * @param email   电子邮件
     */
    public Employee(Integer eId, String empName, Integer age, String sex, String email) {
        this.eId = eId;
        this.empName = empName;
        this.age = age;
        this.sex = sex;
        this.email = email;
    }

    /**
     * gete id
     *
     * @return {@link Integer}
     */
    public Integer geteId() {
        return eId;
    }

    /**
     * id分手
     *
     * @param eId e id
     */
    public void seteId(Integer eId) {
        this.eId = eId;
    }

    /**
     * 获得emp名字
     *
     * @return {@link String}
     */
    public String getEmpName() {
        return empName;
    }

    /**
     * 设置emp名称
     *
     * @param empName emp名字
     */
    public void setEmpName(String empName) {
        this.empName = empName;
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
     * 字符串
     *
     * @return {@link String}
     */
    @Override
    public String toString() {
        return "Employee{" +
                "eId=" + eId +
                ", empName='" + empName + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}