package com.atguigu.domain;

/**
 * 部门
 *
 * @author DELL_
 * @date 2022/03/09
 */
public class Dept {

    /**
     * 部门id
     */
    private Integer deptId;
    /**
     * 部门名称
     */
    private String deptName;

    /**
     * 部门
     */
    public Dept() {
    }

    /**
     * 部门
     *
     * @param deptId   部门id
     * @param deptName 部门名称
     */
    public Dept(Integer deptId, String deptName) {
        this.deptId = deptId;
        this.deptName = deptName;
    }

    /**
     * 得到部门id
     *
     * @return {@link Integer}
     */
    public Integer getDeptId() {
        return deptId;
    }

    /**
     * 设置部门id
     *
     * @param deptId 部门id
     */
    public void setDeptId(Integer deptId) {
        this.deptId = deptId;
    }

    /**
     * 得到部门名称
     *
     * @return {@link String}
     */
    public String getDeptName() {
        return deptName;
    }

    /**
     * 设置部门名称
     *
     * @param deptName 部门名称
     */
    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    /**
     * 字符串
     *
     * @return {@link String}
     */
    @Override
    public String toString() {
        return "Dept{" +
                "deptId=" + deptId +
                ", deptName='" + deptName + '\'' +
                '}';
    }
}
