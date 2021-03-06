package com.tyut.epms.bean;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

public class Leave {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column leave1.id
     *
     * @mbg.generated Thu Mar 26 14:14:18 CST 2020
     */
    private Long id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column leave1.emp_id
     *
     * @mbg.generated Thu Mar 26 14:14:18 CST 2020
     */
    private Long empId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column leave1.emp_name
     *
     * @mbg.generated Thu Mar 26 14:14:18 CST 2020
     */
    private String empName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column leave1.type_of_leave
     *
     * @mbg.generated Thu Mar 26 14:14:18 CST 2020
     */
    private String typeOfLeave;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column leave1.start_time
     *
     * @mbg.generated Thu Mar 26 14:14:18 CST 2020
     */
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date startTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column leave1.end_time
     *
     * @mbg.generated Thu Mar 26 14:14:18 CST 2020
     */
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date endTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column leave1.reason
     *
     * @mbg.generated Thu Mar 26 14:14:18 CST 2020
     */
    private String reason;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column leave1.state
     *
     * @mbg.generated Thu Mar 26 14:14:18 CST 2020
     */
    private String state;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column leave1.opinion
     *
     * @mbg.generated Thu Mar 26 14:14:18 CST 2020
     */
    private String opinion;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column leave1.id
     *
     * @return the value of leave1.id
     *
     * @mbg.generated Thu Mar 26 14:14:18 CST 2020
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column leave1.id
     *
     * @param id the value for leave1.id
     *
     * @mbg.generated Thu Mar 26 14:14:18 CST 2020
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column leave1.emp_id
     *
     * @return the value of leave1.emp_id
     *
     * @mbg.generated Thu Mar 26 14:14:18 CST 2020
     */
    public Long getEmpId() {
        return empId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column leave1.emp_id
     *
     * @param empId the value for leave1.emp_id
     *
     * @mbg.generated Thu Mar 26 14:14:18 CST 2020
     */
    public void setEmpId(Long empId) {
        this.empId = empId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column leave1.emp_name
     *
     * @return the value of leave1.emp_name
     *
     * @mbg.generated Thu Mar 26 14:14:18 CST 2020
     */
    public String getEmpName() {
        return empName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column leave1.emp_name
     *
     * @param empName the value for leave1.emp_name
     *
     * @mbg.generated Thu Mar 26 14:14:18 CST 2020
     */
    public void setEmpName(String empName) {
        this.empName = empName == null ? null : empName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column leave1.type_of_leave
     *
     * @return the value of leave1.type_of_leave
     *
     * @mbg.generated Thu Mar 26 14:14:18 CST 2020
     */
    public String getTypeOfLeave() {
        return typeOfLeave;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column leave1.type_of_leave
     *
     * @param typeOfLeave the value for leave1.type_of_leave
     *
     * @mbg.generated Thu Mar 26 14:14:18 CST 2020
     */
    public void setTypeOfLeave(String typeOfLeave) {
        this.typeOfLeave = typeOfLeave == null ? null : typeOfLeave.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column leave1.start_time
     *
     * @return the value of leave1.start_time
     *
     * @mbg.generated Thu Mar 26 14:14:18 CST 2020
     */
    public Date getStartTime() {
        return startTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column leave1.start_time
     *
     * @param startTime the value for leave1.start_time
     *
     * @mbg.generated Thu Mar 26 14:14:18 CST 2020
     */
    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column leave1.end_time
     *
     * @return the value of leave1.end_time
     *
     * @mbg.generated Thu Mar 26 14:14:18 CST 2020
     */
    public Date getEndTime() {
        return endTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column leave1.end_time
     *
     * @param endTime the value for leave1.end_time
     *
     * @mbg.generated Thu Mar 26 14:14:18 CST 2020
     */
    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column leave1.reason
     *
     * @return the value of leave1.reason
     *
     * @mbg.generated Thu Mar 26 14:14:18 CST 2020
     */
    public String getReason() {
        return reason;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column leave1.reason
     *
     * @param reason the value for leave1.reason
     *
     * @mbg.generated Thu Mar 26 14:14:18 CST 2020
     */
    public void setReason(String reason) {
        this.reason = reason == null ? null : reason.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column leave1.state
     *
     * @return the value of leave1.state
     *
     * @mbg.generated Thu Mar 26 14:14:18 CST 2020
     */
    public String getState() {
        return state;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column leave1.state
     *
     * @param state the value for leave1.state
     *
     * @mbg.generated Thu Mar 26 14:14:18 CST 2020
     */
    public void setState(String state) {
        this.state = state == null ? null : state.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column leave1.opinion
     *
     * @return the value of leave1.opinion
     *
     * @mbg.generated Thu Mar 26 14:14:18 CST 2020
     */
    public String getOpinion() {
        return opinion;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column leave1.opinion
     *
     * @param opinion the value for leave1.opinion
     *
     * @mbg.generated Thu Mar 26 14:14:18 CST 2020
     */
    public void setOpinion(String opinion) {
        this.opinion = opinion == null ? null : opinion.trim();
    }

	@Override
	public String toString() {
		return "Leave [id=" + id + ", empId=" + empId + ", empName=" + empName + ", typeOfLeave=" + typeOfLeave
				+ ", startTime=" + startTime + ", endTime=" + endTime + ", reason=" + reason + ", state=" + state
				+ ", opinion=" + opinion + "]";
	}
}