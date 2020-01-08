package com.example.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.example.pojo.Dept;
import com.example.pojo.Emp;
import com.example.pojo.Salgrade;

@Mapper
public interface MysqlMapper {

	@Select("select * from dept")
	List<Dept> dept();

	@Select("select * from emp")
	List<Emp> emp();

	@Select("select * from salgrade")
	List<Salgrade> salgrade();

}
