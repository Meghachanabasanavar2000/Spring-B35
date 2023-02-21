package org.tnsindia.springautowire;

//Program to demonstrate on autowiring
//driver class

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Executor {

	public static void main(String[] args) {
		ApplicationContext c=new ClassPathXmlApplicationContext("beans.xml");
		Human h1=c.getBean("human",Human.class);
		((Human) h1).startPumping();
		
	}

}
