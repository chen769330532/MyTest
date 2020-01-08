package com.example.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.example.pojo.Dept;

@Mapper
public interface MysqlMapper {

	@Select("select * from dept")
	List<Dept> dept();

}
