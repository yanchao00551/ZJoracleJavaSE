package demo;


/**
 * 第三方  工厂
 * @author 10947
 *
 */
class Factory {

	public static Fruit getInstance(String className) {
		if("apple".equals(className)) {
			return new Apple();
		}
		if("orange".equals(className)) {
			return new Orange();
		}
		return null;
	}

}
