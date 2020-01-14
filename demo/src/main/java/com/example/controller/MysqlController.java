package com.example.controller;

import com.example.common.Response;
import com.example.common.ServicesMsg;
import com.example.common.ServicesStatus;
import com.example.pojo.Dept;
import com.example.pojo.Emp;
import com.example.pojo.Salgrade;
import com.example.service.MysqlService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

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

    @PostMapping("/job")
    public Response<List<Emp>> job(@RequestParam String job) {
        List<Emp> list = new ArrayList<>();
        Response<List<Emp>> response = new Response<>();
        try {
            list = service.job(job);
        } catch (Exception e) {
            response.setMsg(ServicesMsg.SELECT_FAILURE);
            response.setStatus(ServicesStatus.SERVCIE_CALL_FAILURE);
            response.setData(list);
            return response;
        }
        response.setStatus(ServicesStatus.SERVICE_CALL_SUCCESS);
        response.setMsg(ServicesMsg.SELECT_SUCCESS);
        response.setData(list);
        return response;
    }

}
