package com.ebay.core.event;

import com.ebay.entity.Dept;

import lombok.Getter;
import lombok.experimental.Delegate;
import org.springframework.context.ApplicationEvent;

import java.io.Serializable;


public class DeptEntityEvent extends ApplicationEvent implements Serializable {
	@Delegate
	@Getter
	private Dept dept;



	public DeptEntityEvent(Object source) {
		super(source);
		this.dept = new Dept();
	}
	public DeptEntityEvent(Dept dept, Object source){
		super(source);
		this.dept = dept;
	}
}
