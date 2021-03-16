package com.skeyedu.entity;

import java.io.Serializable;
import com.crezyman.annotation.NotField;
import com.crezyman.annotation.Table;

/**
 * 实体类
 * @author 10947
 *
 */
@Table(name = "book") 
public class BookEntity implements Serializable {
	/**
	 * 
	 */
	@NotField
	private static final long serialVersionUID = 1L;
	
	
	private Integer bId;      
	private String bName;   
	private Integer pId;    
	private String bAuthor;    
	private Double bPrice;     
	

	@NotField
	private String pName;
	@NotField
	private String pLinkman;
	@NotField
	private String pTel;
	@NotField
	private String pAddress;
	
	@NotField
	private PublisherEntity publisher;
	
	
	public Integer getbId() {
		return bId;
	}
	public void setbId(Integer bId) {
		this.bId = bId;
	}
	public String getbName() {
		return bName;
	}
	public void setbName(String bName) {
		this.bName = bName;
	}
	public Integer getpId() {
		return pId;
	}
	public void setpId(Integer pId) {
		this.pId = pId;
	}
	public String getbAuthor() {
		return bAuthor;
	}
	public void setbAuthor(String bAuthor) {
		this.bAuthor = bAuthor;
	}
	public Double getbPrice() {
		return bPrice;
	}
	public void setbPrice(Double bPrice) {
		this.bPrice = bPrice;
	}
	
	public BookEntity() {
		
	}
	public PublisherEntity getPublisher() {
		return publisher;
	}
	public void setPublisher(PublisherEntity publisher) {
		this.publisher = publisher;
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
	
	
	public BookEntity(Integer bId, String bName, Integer pId, String bAuthor, Double bPrice, PublisherEntity publisher) {
		super();
		this.bId = bId;
		this.bName = bName;
		this.pId = pId;
		this.bAuthor = bAuthor;
		this.bPrice = bPrice;
		this.publisher = publisher;
	}
	@Override
	public String toString() {
		return "BookEntity [bId=" + bId + ", bName=" + bName + ", pId=" + pId + ", bAuthor=" + bAuthor + ", bPrice="
				+ bPrice + ", pName=" + pName + ", pLinkman=" + pLinkman + ", pTel=" + pTel + ", pAddress=" + pAddress
				+ ", publisher=" + publisher + "]";
	}
	
	

	
	
	
	
	
}
