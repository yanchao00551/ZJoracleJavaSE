package com.ebay.core.object;

import java.io.Serializable;
import java.util.Date;

import lombok.Data;

@Data
public abstract class AbstractDO implements Serializable {
	
	
	private Long id;
	
	
	private Date createTime;
	
	private Date updateTime;
	
}
