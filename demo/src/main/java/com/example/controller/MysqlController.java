package com.example.controller;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.common.Response;
import com.example.common.ServicesMsg;
import com.example.common.ServicesStatus;
import com.example.pojo.Dept;
import com.example.pojo.Emp;
import com.example.pojo.Salgrade;
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

	@PostMapping("/emp")
	public Response<List<Emp>> emp() {
		Response<List<Emp>> response = new Response<>();
		List<Emp> list = new ArrayList<>();
		try {
			list = service.emp();
		} catch (Exception e) {
			response.setData(list);
			response.setMsg(ServicesMsg.SELECT_FAILURE);
			response.setStatus(ServicesStatus.SERVCIE_CALL_FAILURE);
			return response;
		}
		response.setData(list);
		response.setMsg(ServicesMsg.SELECT_SUCCESS);
		response.setStatus(ServicesStatus.SERVICE_CALL_SUCCESS);
		return response;
	}

	@PostMapping("/salgrade")
	public Response<List<Salgrade>> salgrade() {
		List<Salgrade> list = new ArrayList<Salgrade>();
		Response<List<Salgrade>> response = new Response<List<Salgrade>>();
		try {
			list = service.salgrade();
		} catch (Exception e) {
			response.setData(list);
			response.setMsg(ServicesMsg.SELECT_FAILURE);
			response.setStatus(ServicesStatus.SERVCIE_CALL_FAILURE);
			return response;
		}
		response.setData(list);
		response.setMsg(ServicesMsg.SELECT_SUCCESS);
		response.setStatus(ServicesStatus.SERVICE_CALL_SUCCESS);
		return response;
	}

	@PostMapping("/dept")
	public Response<List<Dept>> dept() {
		List<Dept> list = new ArrayList<Dept>();
		Response<List<Dept>> response = new Response<List<Dept>>();
		try {
			list = service.dept();
		} catch (Exception e) {
			response.setData(list);
			response.setMsg(ServicesMsg.SELECT_FAILURE);
			response.setStatus(ServicesStatus.SERVCIE_CALL_FAILURE);
			return response;
		}
		response.setData(list);
		response.setMsg(ServicesMsg.SELECT_SUCCESS);
		response.setStatus(ServicesStatus.SERVICE_CALL_SUCCESS);
		return response;
	}

}
