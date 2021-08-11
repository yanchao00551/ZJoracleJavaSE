package com.ebay.dao;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.ebay.core.object.BaseMapper;
import com.ebay.entity.Dept;

@Mapper
@Repository
public interface DeptMapper extends BaseMapper<Dept>{
	
	

}
