package com.visa.prj.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME) //telling compiler and class loader not to touch this
@Target(ElementType.METHOD)
public @interface Table {
	String name();
	String type() default "VARCHAR (100)";
}
