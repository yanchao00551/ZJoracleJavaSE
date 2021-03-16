package demo;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(value = RetentionPolicy.RUNTIME)
 @interface MyAnnotation {
	 public String key();
	 public String value();
}
