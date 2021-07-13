package demo;

public class UserEntity {
	private Integer id;     //所有字母没有1个大写，第一个字母大写
	private Integer bId;   //第一个字母小写，第二个字母大写，其余不管大小写，首个字母小写
	private Integer baId;  //第一个字母小写，第二字母小写，其余只要1个大写字母，首个字母改大写其他不变
	 
	


	
	public Integer getBaId() {
		return baId;
	}
	public void setBaId(Integer baId) {
		this.baId = baId;
	}
	
	
	
	
}
