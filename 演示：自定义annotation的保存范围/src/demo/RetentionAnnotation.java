package demo;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;


//定义该自定义Annotation的保存范围是 RUNTIME
@Retention(value = RetentionPolicy.RUNTIME)
@interface RetentionAnnotation {
	public String value();
}
