package org.demo.entity;

public class Pictrue {
	private Integer pid;
	private String pName;
	private String pUrl;
	public Integer getPid() {
		return pid;
	}
	public void setPid(Integer pid) {
		this.pid = pid;
	}
	public String getpName() {
		return pName;
	}
	public void setpName(String pName) {
		this.pName = pName;
	}
	public String getpUrl() {
		return pUrl;
	}
	public void setpUrl(String pUrl) {
		this.pUrl = pUrl;
	}
	@Override
	public String toString() {
		return "Pictrue [pid=" + pid + ", pName=" + pName + ", pUrl=" + pUrl + "]";
	}
	
	
}
