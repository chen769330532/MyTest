package com.example.controller;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.pojo.Dept;
import com.example.service.MysqlService;

@RestController
@RequestMapping("/mysql")
public class MysqlController {

	@Autowired
	private MysqlService service;

	@PostMapping("/test1")
	public String test1() {
		return "测试MysqlController";
	}

	@PostMapping("/dept")
	public List<Dept> dept() {
		List<Dept> list = service.dept();
		return list.isEmpty() ? new ArrayList<Dept>() : list;
	}
	
	
}
