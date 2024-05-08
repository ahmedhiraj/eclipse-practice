package com.bjshub.login;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");	
Trial t=(Trial) context.getBean("trial");
System.out.println(t);
t.disp();
	}

}
