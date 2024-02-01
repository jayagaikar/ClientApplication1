package com.BikkadIT.ClientApplication1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.BikkadIT.AdditionLogic.calculator.sum;

@SpringBootApplication
public class ClientApplication1Application {

	public static void main(String[] args) {
		SpringApplication.run(ClientApplication1Application.class, args);
		
		sum s1 = new sum();
		int s2 = s1.Add(10,20);
		System.out.println(s2);
		
	}

	
	
}
