package com.jpa.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.jpa.test.Entity.User;
import com.jpa.test.dao.UserRepositry;

@SpringBootApplication
public class BootjpaexampleApplication {

	public static void main(String[] args) {
		ApplicationContext context=SpringApplication.run(BootjpaexampleApplication.class, args);
		UserRepositry userRepositry=context.getBean(UserRepositry.class);
		User user=new User();
		
		user.setName("Alok");
		user.setCity("Delhi");
		user.setStatus("I am a java Programmer");
		User user1=userRepositry.save(user);
		System.out.println(user1);
	}

}
