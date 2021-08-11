package com.ebay.service.impl;

import com.ebay.core.bean.DeptEntity;
import com.ebay.vo.DeptConditionVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ebay.dao.DeptMapper;
import com.ebay.entity.Dept;
import com.ebay.service.DeptService;

import java.util.LinkedList;
import java.util.List;


@Service("deptService")
public class DeptServiceImpl implements DeptService{
	
	
	@Autowired
	private DeptMapper deptMapper;
	
	
	@Override
	public Integer addDept(Dept dept) {
		// TODO Auto-generated method stub
		return deptMapper.insert(dept);
	}

	@Override
	public List<DeptEntity> queryFindPageAllData(DeptConditionVO vo) {
		List<Dept> depts = deptMapper.selectAll();


		List<DeptEntity> list = new LinkedList<>();
		depts.stream().forEach((item) -> {
			list.add(new DeptEntity(item));
		});


		return list;
	}

}
