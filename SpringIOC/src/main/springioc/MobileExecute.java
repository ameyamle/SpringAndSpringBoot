package org.tnsif.springioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//program to demonstrate on Spring IOC
//driver class
public class MobileExecute {

	public static void main(String[] args) {
		
		/*hardcore/boiler code
		Airtel a = new Airtel();
		a.call();
		a.message();
		
		Jio j = new Jio();
		j.call();
		j.message();
		*/
		
		ApplicationContext c = new ClassPathXmlApplicationContext("");
		Airtel a =(Airtel) c.getBean("Airtel");
		a.call();
		a.message();

	}

}
