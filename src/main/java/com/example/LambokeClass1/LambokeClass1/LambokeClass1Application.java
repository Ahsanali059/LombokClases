package com.example.LambokeClass1.LambokeClass1;

import com.example.LambokeClass1.LambokeClass1.beans.Employee;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LambokeClass1Application {

	public static void main(String[] args) {
		//SpringApplication.run(LambokeClass1Application.class, args);


		Employee emp = new Employee();
		emp.setName("Ahsan");
		emp.setId(1);
		emp.setSalary("60,000");
		emp.setJoiningDate("25/2/2023");


		System.out.println(emp.getId());
		System.out.println(emp.getName());
		System.out.println(emp.getJoiningDate());
		System.out.println(emp.getJoiningDate());





	}

}
