package demo;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;


//������Զ���Annotation�ı��淶Χ�� RUNTIME
@Retention(value = RetentionPolicy.RUNTIME)
@interface RetentionAnnotation {
	public String value();
}
