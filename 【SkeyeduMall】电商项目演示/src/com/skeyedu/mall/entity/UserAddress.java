package com.skeyedu.mall.entity;

import java.io.Serializable;
import java.util.Date;

public class UserAddress implements Serializable{

	private static final long serialVersionUID = 1L;
	
	
	private Integer id;
	private String address;
	private Integer userId;
	private Date createTime;
	private String remark; 
	private Integer isDefault;  //是否是默认地址（1：是  0：否）
	
	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	public Integer getIsDefault() {
		return isDefault;
	}
	public void setIsDefault(Integer isDefault) {
		this.isDefault = isDefault;
	}
	
	
	

}
