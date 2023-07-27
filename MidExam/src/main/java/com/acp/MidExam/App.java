package com.acp.MidExam;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context=new AnnotationConfigApplicationContext(AppConfiguration.class);
		/*
		 * ApplicationContext context=new ClassPathXmlApplicationContext("AppCon.xml");
		 */
        Person p=context.getBean(Person.class);
        p.playWithToy();
        p.chargeTheToy("15");
		p.chargeTheToy("100");
    }
}
