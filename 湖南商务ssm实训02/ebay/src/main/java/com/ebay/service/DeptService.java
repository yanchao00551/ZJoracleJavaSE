package com.ebay.service;

import com.ebay.core.bean.DeptEntity;
import com.ebay.entity.Dept;
import com.ebay.vo.DeptConditionVO;

import java.util.List;

public interface DeptService {
	
	Integer addDept(Dept dept);

	/**
     * 分页查或按条件集查询
     * @author 悟空
     * @description //TODO
     * @date 9:53 2021/6/26
     * @param vo

     */
    List<DeptEntity> queryFindPageAllData(DeptConditionVO vo);
}
