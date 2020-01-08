package com.example.pojo;

import lombok.Data;

@Data
public class Emp {
	
	/**
	 * 员工编号
	 */
	private String empNo;
	
	/**
	 * 员工姓名
	 */
	private String eName;
	
	/**
	 * 员工岗位
	 */
	private String job;
	
	/**
	 * 员工领导编号
	 */
	private String mgr;
	
	/**
	 * 入职日期
	 */
	private String hireDate;
	
	/**
	 * 工资
	 */
	private String sal;
	
	/**
	 * 奖金
	 */
	private String comm;
	
	/**
	 * 部门编号
	 */
	private String deptNo;
	
}
