package com.ebay;


import com.ebay.core.bean.DeptEntity;
import com.ebay.service.DeptService;
import com.ebay.service.rabbitmq.MqPublisher;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.TransactionConfiguration;
import java.util.Date;


@Slf4j
@RunWith(SpringJUnit4ClassRunner.class)
@TransactionConfiguration(defaultRollback = true)
@ContextConfiguration(locations = { "classpath:spring-mybatis.xml","classpath:spring-rabbitmq.xml"})
public class Test1 {


	@Autowired
	private DeptService deptService;

	@Autowired
	private MqPublisher mqPublisher;



	@Test
	public void test11() {
		DeptEntity deptEntity = new DeptEntity();
		deptEntity.setDname("财务部");
		deptEntity.setIoc("部门说明");
		deptEntity.setCreateTime(new Date());
		deptService.addDept(deptEntity.getDept());
		log.info("deptEntity:{}",deptEntity);
	}



	@Test
	public void test33() {
		DeptEntity deptEntity = new DeptEntity();
		deptEntity.setDname("财务部");
		deptEntity.setIoc("部门说明");
		deptEntity.setCreateTime(new Date());
		mqPublisher.sendObjectMsg(deptEntity);
	}



}
