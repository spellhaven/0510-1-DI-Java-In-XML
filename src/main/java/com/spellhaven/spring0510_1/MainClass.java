package com.spellhaven.spring0510_1;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {

		AbstractApplicationContext ctx = new GenericXmlApplicationContext("classpath:applicationCTX.xml");
	
		Student stu1 = ctx.getBean("student1", Student.class);		
		System.out.println(stu1.getName());
		
		Student stu3 = ctx.getBean("student3", Student.class);
		System.out.println(stu3.getName());
	}

}
