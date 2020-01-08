package com.example.service;

import java.util.List;

import com.example.pojo.Dept;
import com.example.pojo.Emp;
import com.example.pojo.Salgrade;

public interface MysqlService {

	List<Dept> dept();

	List<Emp> emp();

	List<Salgrade> salgrade();

}
