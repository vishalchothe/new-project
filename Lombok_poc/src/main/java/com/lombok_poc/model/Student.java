package com.lombok_poc.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

//@Setter
//@Getter
//@ToString
//@AllArgsConstructor
//@NoArgsConstructor
@Data
public class Student {
	
	private int sid;
	private String name;
	private String age;
	private String address;
	
	


}
