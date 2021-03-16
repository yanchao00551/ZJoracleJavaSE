package com.skeyedu.entity.student;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import com.skeyedu.annotation.NotField;
import com.skeyedu.annotation.Table;
import com.skeyedu.entity.book.BookEntity;

/**
 * 学生信息表实体类
 * @author 10947
 *
 */
@Table(name = "tb_student")
public class StudentEntity implements Serializable{
	
	
	/**
	 * 
	 */
	@NotField
	private static final long serialVersionUID = 1L;
	
	
	/*顺序和表一致 */
	private Integer id;
	private String 	stdId;
	private String name;
	private BigDecimal money;  
	private Double grade;
	private Integer sex;
	private Date createTime;
	private Integer isDelete;
	
	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getStdId() {
		return stdId;
	}
	public void setStdId(String stdId) {
		this.stdId = stdId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public BigDecimal getMoney() {
		return money;
	}
	public void setMoney(BigDecimal money) {
		this.money = money;
	}
	public Double getGrade() {
		return grade;
	}
	public void setGrade(Double grade) {
		this.grade = grade;
	}
	public Integer getSex() {
		return sex;
	}
	public void setSex(Integer sex) {
		this.sex = sex;
	}
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	public Integer getIsDelete() {
		return isDelete;
	}
	public void setIsDelete(Integer isDelete) {
		this.isDelete = isDelete;
	}
	
	
	public StudentEntity() {
		
	}
	
	public StudentEntity(Integer id, String stdId, String name, BigDecimal money, Double grade, Integer sex,
			Date createTime, Integer isDelete) {
		super();
		this.id = id;
		this.stdId = stdId;
		this.name = name;
		this.money = money;
		this.grade = grade;
		this.sex = sex;
		this.createTime = createTime;
		this.isDelete = isDelete;
	}
	
	
	@Override
	public String toString() {
		return "StudentEntity [id=" + id + ", stdId=" + stdId + ", name=" + name + ", money=" + money + ", grade="
				+ grade + ", sex=" + sex + ", createTime=" + createTime + ", isDelete=" + isDelete + "]";
	}
	
	
	

	

	
	
}
