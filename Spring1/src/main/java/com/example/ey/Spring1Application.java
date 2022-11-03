package com.example.ey;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.ey.classes.Aeroplane;

@SpringBootApplication
public class Spring1Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Spring1Application.class, args);
		// Above application will get the memory object of our application 
		
		Aeroplane a1 = context.getBean(Aeroplane.class);
		//getBean is used to get object of class
		// Above statement will get the instance of Airplane class
		
		System.out.println(a1.fly());
		//Call fly() method to get the flight
	}

}
