package com.atguigu.mybatis.pojo;

public class Emp {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_emp.id
     *
     * @mbggenerated Tue Mar 15 11:36:14 CST 2022
     */
    private Integer eid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_emp.name
     *
     * @mbggenerated Tue Mar 15 11:36:14 CST 2022
     */
    private String empName;

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

    private String sex;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_emp.empno
     *
     * @mbggenerated Tue Mar 15 11:36:14 CST 2022
     */
    private Integer empno;

    public Emp() {
    }

    public Emp(Integer eid, String empName, Integer age, Integer deptid, Integer empno) {
        this.eid = eid;
        this.empName = empName;
        this.age = age;
        this.deptid = deptid;
        this.empno = empno;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_emp.id
     *
     * @return the value of t_emp.id
     *
     * @mbggenerated Tue Mar 15 11:36:14 CST 2022
     */
    public Integer getEid() {
        return eid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_emp.id
     *
     * @param id the value for t_emp.id
     *
     * @mbggenerated Tue Mar 15 11:36:14 CST 2022
     */
    public void setId(Integer eid) {
        this.eid = eid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_emp.name
     *
     * @return the value of t_emp.name
     *
     * @mbggenerated Tue Mar 15 11:36:14 CST 2022
     */
    public String getEmpName() {
        return empName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_emp.name
     *
     * @param name the value for t_emp.name
     *
     * @mbggenerated Tue Mar 15 11:36:14 CST 2022
     */
    public void setEmpName(String empName) {
        this.empName = empName == null ? null : empName.trim();
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

    public void setEid(Integer eid) {
        this.eid = eid;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    private String email;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    private Integer did;
    private String delFlag;

    public Integer getDid() {
        return did;
    }

    public void setDid(Integer did) {
        this.did = did;
    }

    public String getDelFlag() {
        return delFlag;
    }

    public void setDelFlag(String delFlag) {
        this.delFlag = delFlag;
    }

    @Override
    public String toString() {
        return "Emp{" +
                "eid=" + eid +
                ", empName='" + empName + '\'' +
                ", age=" + age +
                ", deptid=" + deptid +
                ", sex='" + sex + '\'' +
                ", empno=" + empno +
                ", email='" + email + '\'' +
                ", did=" + did +
                ", delFlag='" + delFlag + '\'' +
                '}';
    }
}
