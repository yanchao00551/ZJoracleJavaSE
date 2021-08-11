package com.ebay.core.bean;

import com.ebay.entity.Dept;
import lombok.Data;
import lombok.Getter;
import lombok.experimental.Delegate;
import org.springframework.context.ApplicationEvent;

import java.io.Serializable;

@Data
public class DeptEntity implements Serializable {
	@Delegate
	private Dept dept;

	public DeptEntity() {
		this.dept = new Dept();
	}
	public DeptEntity(Dept dept){
		this.dept = dept;
	}
}
