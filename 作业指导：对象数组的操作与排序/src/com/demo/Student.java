package com.demo;

/**
 * 学生类
 * @author 10947
 *
 */
public class Student {
	private Integer number;
	private Integer state;
	private Integer score;
	public Integer getNumber() {
		return number;
	}
	public void setNumber(Integer number) {
		this.number = number;
	}
	public Integer getState() {
		return state;
	}
	public void setState(Integer state) {
		this.state = state;
	}
	public Integer getScore() {
		return score;
	}
	public void setScore(Integer score) {
		this.score = score;
	}
	
	
	public Student(Integer number, Integer state, Integer score) {
		this.number = number;
		this.state = state;
		this.score = score;
	}
	
	@Override
	public String toString() {
		return "Student [number=" + number + ", state=" + state + ", score=" + score + "]";
	}

	
	
}
