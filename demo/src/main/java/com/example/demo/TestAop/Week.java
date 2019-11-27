package com.example.demo.TestAop;

public enum Week {
	MONDAY("星期一","周一"),TUESDAY("星期二"),WEDNESDAY("星期三","周三"),THURSDAY("星期四");
	
	private String value;
	
	private String value1;
	
	private Week(String value) {
		this.value = value;
	}
	
	private Week(String value,String value1) {
		this.value=value;
		this.value1=value1;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public String getValue1() {
		return value1;
	}

	public void setValue1(String value1) {
		this.value1 = value1;
	}


	
	
	
}
