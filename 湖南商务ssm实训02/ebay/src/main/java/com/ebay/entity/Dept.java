package com.ebay.entity;

import com.ebay.core.object.AbstractDO;

import lombok.Data;
import lombok.ToString;


@Data
@ToString
public class Dept extends AbstractDO {
	private String dname;
	private String ioc;
}
