package com.tyut.epms.bean;

public class Department {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column department.id
     *
     * @mbg.generated Thu Mar 26 13:35:56 CST 2020
     */
    private Long id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column department.dep_name
     *
     * @mbg.generated Thu Mar 26 13:35:56 CST 2020
     */
    private String depName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column department.introduction
     *
     * @mbg.generated Thu Mar 26 13:35:56 CST 2020
     */
    private String introduction;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column department.count
     *
     * @mbg.generated Thu Mar 26 13:35:56 CST 2020
     */
    private Integer count;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column department.id
     *
     * @return the value of department.id
     *
     * @mbg.generated Thu Mar 26 13:35:56 CST 2020
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column department.id
     *
     * @param id the value for department.id
     *
     * @mbg.generated Thu Mar 26 13:35:56 CST 2020
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column department.dep_name
     *
     * @return the value of department.dep_name
     *
     * @mbg.generated Thu Mar 26 13:35:56 CST 2020
     */
    public String getDepName() {
        return depName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column department.dep_name
     *
     * @param depName the value for department.dep_name
     *
     * @mbg.generated Thu Mar 26 13:35:56 CST 2020
     */
    public void setDepName(String depName) {
        this.depName = depName == null ? null : depName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column department.introduction
     *
     * @return the value of department.introduction
     *
     * @mbg.generated Thu Mar 26 13:35:56 CST 2020
     */
    public String getIntroduction() {
        return introduction;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column department.introduction
     *
     * @param introduction the value for department.introduction
     *
     * @mbg.generated Thu Mar 26 13:35:56 CST 2020
     */
    public void setIntroduction(String introduction) {
        this.introduction = introduction == null ? null : introduction.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column department.count
     *
     * @return the value of department.count
     *
     * @mbg.generated Thu Mar 26 13:35:56 CST 2020
     */
    public Integer getCount() {
        return count;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column department.count
     *
     * @param count the value for department.count
     *
     * @mbg.generated Thu Mar 26 13:35:56 CST 2020
     */
    public void setCount(Integer count) {
        this.count = count;
    }
}