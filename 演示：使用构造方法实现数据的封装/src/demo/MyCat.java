package demo;

class MyCat {
	//创建私有化属性
	private float weight;
	private float height;
	
	
	public float getWeight() {
		return weight;
	}
	public float getHeight() {
		return height;
	}
	
	
	
	//getter和setter方法虽然默认生成 但能被认为修改
	private void setWeight(float weight) {
		this.weight = weight;
	}
	
	private void setHeight(float height) {
		this.height = height;
	}
	
	
	public MyCat(float height,float weight) {
		setWeight(weight);
		setHeight(height);
	}
	
	
}
