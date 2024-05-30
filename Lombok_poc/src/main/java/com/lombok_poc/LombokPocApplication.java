package com.lombok_poc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.lombok_poc.model.Student;

@SpringBootApplication
public class LombokPocApplication {

	public static void main(String[] args) {
		SpringApplication.run(LombokPocApplication.class, args);

		Student s = new Student();
		s.setSid(1);
		s.setName("Vaibhav");
		s.setAge("31");
		s.setAddress("Takalimiya");

		System.out.println(s.getSid());
		System.out.println(s.getName());
		System.out.println(s.getAge());
		System.out.println(s.getAddress());
		System.out.println("--------------------------");
		System.out.println(s);
		System.out.println("--------------------------");
		/*Student s1 = new Student(2,"vishal","21","Pune");
		System.out.println(s1.getSid());
		System.out.println(s1.getName());
		System.out.println(s1.getAge());
		System.out.println(s1.getAddress());*/
	}

}
