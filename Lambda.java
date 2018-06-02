package com.test;

import java.util.ArrayList;
import java.util.List;

public class Lambda {

	public static void main(String[] args) {
		List names=new ArrayList();
		names.add("Mahesh");
		names.add("Test");
	      names.add("Suresh");
	      names.add("Ramesh");
	      names.add("Naresh");
	      names.add("Kalpesh");
	      
	      names.forEach(System.out::println);
	}

}
