package com.java.ex;

import java.util.HashSet;

public class MainClass {

	public static void main(String[] args) {
		HashSet<Student> hSet = new HashSet<Student>();
		hSet.add(new Student("박남일",1));
		hSet.add(new Student("배수지",5));
		hSet.add(new Student("박보검",9));
		
		System.out.println(hSet.toString());
		
		Student st = new Student("박보검", 9);
		hSet.remove(st);
		
		System.out.println(hSet.toString());
	}
}
