package com.example.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dao.MysqlMapper;
import com.example.pojo.Dept;
import com.example.pojo.Emp;
import com.example.pojo.Salgrade;
import com.example.service.MysqlService;

@Service
public class MysqlServiceImpl implements MysqlService {

	@Autowired
	private MysqlMapper mapper;

	@Override
	public List<Dept> dept() {
		List<Dept> list = mapper.dept();
		return list;
	}

	@Override
	public List<Emp> emp() {
		List<Emp> list = mapper.emp();
		return list;
	}

	@Override
	public List<Salgrade> salgrade() {
		List<Salgrade> list = mapper.salgrade();
		return list;
	}

}
