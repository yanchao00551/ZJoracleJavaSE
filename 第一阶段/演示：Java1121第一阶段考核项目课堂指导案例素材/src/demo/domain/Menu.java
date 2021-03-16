package demo.domain;

import java.io.Serializable;
import java.math.BigDecimal;

import com.crezyman.annotation.NotField;
import com.crezyman.annotation.Table;



@Table(name = "menu")
public class Menu implements Serializable{
	
	/**
	 * 
	 */
	@NotField
	private static final long serialVersionUID = 1L;
	
	private Integer id;
	private String dishName;
	private BigDecimal price;
	private Integer praiseNums;
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getDishName() {
		return dishName;
	}

	public void setDishName(String dishName) {
		this.dishName = dishName;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public Integer getPraiseNums() {
		return praiseNums;
	}

	public void setPraiseNums(Integer praiseNums) {
		this.praiseNums = praiseNums;
	}

   public Menu() {
	   
   }
   public Menu(Integer id, String dishName, BigDecimal price, Integer praiseNums) {
		
		this.id = id;
		this.dishName = dishName;
		this.price = price;
		this.praiseNums = praiseNums;
	}

	@Override
	public String toString() {
		return "Menu [id=" + id + ", dishName=" + dishName + ", price=" + price + ", praiseNums=" + praiseNums
				+ "]";
	}
	
	
}
