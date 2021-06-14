package org.news.entity;

import java.io.Serializable;

public class NewsUser implements Serializable{

	
	private static final long serialVersionUID = 1L;
	

	private Integer uid;
	private String uname;
	private String upwd;
	public Integer getUid() {
		return uid;
	}
	public void setUid(Integer uid) {
		this.uid = uid;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getUpwd() {
		return upwd;
	}
	public void setUpwd(String upwd) {
		this.upwd = upwd;
	}
	
	public NewsUser() {
		
	}
	
	public NewsUser(String uname, String upwd) {
		this.uname = uname;
		this.upwd = upwd;
	}
	
	@Override
	public String toString() {
		return "NewsUser [uid=" + uid + ", uname=" + uname + ", upwd=" + upwd + "]";
	}
	
	

	
	
}
