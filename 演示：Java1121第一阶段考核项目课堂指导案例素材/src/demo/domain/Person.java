package demo.domain;

import java.math.BigDecimal;
import java.util.Date;

import com.crezyman.annotation.NotField;
import com.crezyman.annotation.Table;

/**
 * 表网关设计模式   1个表 对应 一个实体类  对应 person表
 * @author 10947
 *
 */
@Table(name = "person")
public class Person {
	/* 主表字段 */
	private Integer pid;
	private String name;
	private Integer age;
	private Date birthday;
	private BigDecimal salary;
	private int likeBid;
	
	
	
	
	/* 从表字段  生成从表字段的setter/getter */
	@NotField
	private String bName;
	@NotField
	private Integer  pId;
	@NotField
	private String bAuthor;
	@NotField
	private Double bPrice;
	
	
	public Integer getPid() {
		return pid;
	}
	public void setPid(Integer pid) {
		this.pid = pid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	public BigDecimal getSalary() {
		return salary;
	}
	public void setSalary(BigDecimal salary) {
		this.salary = salary;
	}
	public int getLikeBid() {
		return likeBid;
	}
	public void setLikeBid(int likeBid) {
		this.likeBid = likeBid;
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
	@Override
	public String toString() {
		return "Person [pid=" + pid + ", name=" + name + ", age=" + age + ", birthday=" + birthday + ", salary="
				+ salary + ", likeBid=" + likeBid + ", bName=" + bName + ", pId=" + pId + ", bAuthor=" + bAuthor
				+ ", bPrice=" + bPrice + "]";
	}

	
}
