package com.skeyedu.entity.publisher;

import java.io.Serializable;

import com.skeyedu.annotation.NotField;
import com.skeyedu.annotation.Table;

@Table(name = "publisher")
public class PublisherEntity implements Serializable{

	@NotField
	private static final long serialVersionUID = 1L;

	private Integer pId;
	private String pName;
	private String pLinkman;
	private String pTel;
	private String pAddress;
	public Integer getpId() {
		return pId;
	}
	public void setpId(Integer pId) {
		this.pId = pId;
	}
	public String getpName() {
		return pName;
	}
	public void setpName(String pName) {
		this.pName = pName;
	}
	public String getpLinkman() {
		return pLinkman;
	}
	public void setpLinkman(String pLinkman) {
		this.pLinkman = pLinkman;
	}
	public String getpTel() {
		return pTel;
	}
	public void setpTel(String pTel) {
		this.pTel = pTel;
	}
	public String getpAddress() {
		return pAddress;
	}
	public void setpAddress(String pAddress) {
		this.pAddress = pAddress;
	}
	
	
	public PublisherEntity() {
		
	}
	public PublisherEntity(Integer pId, String pName, String pLinkman, String pTel, String pAddress) {
		super();
		this.pId = pId;
		this.pName = pName;
		this.pLinkman = pLinkman;
		this.pTel = pTel;
		this.pAddress = pAddress;
	}
	@Override
	public String toString() {
		return "Publisher [pId=" + pId + ", pName=" + pName + ", pLinkman=" + pLinkman + ", pTel=" + pTel
				+ ", pAddress=" + pAddress + "]";
	}
	
	
}
