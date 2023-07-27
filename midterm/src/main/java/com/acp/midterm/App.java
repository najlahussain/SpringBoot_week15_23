package com.acp.midterm;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext con=new ClassPathXmlApplicationContext("NewFile.xml");
       Person p=(Person)con.getBean(Person.class);
         p.getToy().charge("15");
         
         
         
         Babytoy b=(Babytoy)con.getBean(Babytoy.class);
        b.play();
        /*
        Toy t=(Toy)con.getBean(Toy.class);
       t.charge("20");*/
       
       
    }
}
