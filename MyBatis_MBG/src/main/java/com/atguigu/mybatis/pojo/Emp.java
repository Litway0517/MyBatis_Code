package com.atguigu.mybatis.pojo;

public class Emp {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_emp.id
     *
     * @mbggenerated Tue Mar 15 11:36:14 CST 2022
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_emp.name
     *
     * @mbggenerated Tue Mar 15 11:36:14 CST 2022
     */
    private String name;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_emp.age
     *
     * @mbggenerated Tue Mar 15 11:36:14 CST 2022
     */
    private Integer age;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_emp.deptId
     *
     * @mbggenerated Tue Mar 15 11:36:14 CST 2022
     */
    private Integer deptid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_emp.empno
     *
     * @mbggenerated Tue Mar 15 11:36:14 CST 2022
     */
    private Integer empno;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_emp.id
     *
     * @return the value of t_emp.id
     *
     * @mbggenerated Tue Mar 15 11:36:14 CST 2022
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_emp.id
     *
     * @param id the value for t_emp.id
     *
     * @mbggenerated Tue Mar 15 11:36:14 CST 2022
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_emp.name
     *
     * @return the value of t_emp.name
     *
     * @mbggenerated Tue Mar 15 11:36:14 CST 2022
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_emp.name
     *
     * @param name the value for t_emp.name
     *
     * @mbggenerated Tue Mar 15 11:36:14 CST 2022
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_emp.age
     *
     * @return the value of t_emp.age
     *
     * @mbggenerated Tue Mar 15 11:36:14 CST 2022
     */
    public Integer getAge() {
        return age;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_emp.age
     *
     * @param age the value for t_emp.age
     *
     * @mbggenerated Tue Mar 15 11:36:14 CST 2022
     */
    public void setAge(Integer age) {
        this.age = age;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_emp.deptId
     *
     * @return the value of t_emp.deptId
     *
     * @mbggenerated Tue Mar 15 11:36:14 CST 2022
     */
    public Integer getDeptid() {
        return deptid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_emp.deptId
     *
     * @param deptid the value for t_emp.deptId
     *
     * @mbggenerated Tue Mar 15 11:36:14 CST 2022
     */
    public void setDeptid(Integer deptid) {
        this.deptid = deptid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_emp.empno
     *
     * @return the value of t_emp.empno
     *
     * @mbggenerated Tue Mar 15 11:36:14 CST 2022
     */
    public Integer getEmpno() {
        return empno;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_emp.empno
     *
     * @param empno the value for t_emp.empno
     *
     * @mbggenerated Tue Mar 15 11:36:14 CST 2022
     */
    public void setEmpno(Integer empno) {
        this.empno = empno;
    }
}