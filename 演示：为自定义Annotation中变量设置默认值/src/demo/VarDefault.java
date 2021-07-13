package demo;


/*
 * 给变量添加默认值 default
 */
@interface VarDefault {
	public String key() default "var1";
	public String value() default "test";
}
