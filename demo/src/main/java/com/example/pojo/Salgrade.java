package com.example.pojo;

import lombok.Data;

@Data
public class Salgrade {

	/**
	 * 等级
	 */
	private String grade;
	
	/**
	 * 最低工资
	 */
	private String losal;
	
	/**
	 * 最高工资
	 */
	private String hisal;
}
