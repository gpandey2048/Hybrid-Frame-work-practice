package com.project.DriverProgrames;

import java.lang.reflect.Method;

public class ReflectionDemo {

	
	public static void test1() {
		
		System.out.println("My name is test1");
		
		
	}
	
	public static void test2() {
		
	System.out.println("My name is test2");	
	}
	
	
	public static void main(String[] args) throws Exception, Exception {
String str="test2";


/*if(str.equals("test2")) {
	
	test2();*/

ReflectionDemo api= new ReflectionDemo();
Method m = api.getClass().getMethod(str);
m.invoke(m);


}
	}


