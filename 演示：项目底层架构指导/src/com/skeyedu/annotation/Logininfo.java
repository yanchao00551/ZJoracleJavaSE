package com.skeyedu.annotation;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(value=RetentionPolicy.RUNTIME)
@interface Logininfo {
	public String name();
	public String password();
}
