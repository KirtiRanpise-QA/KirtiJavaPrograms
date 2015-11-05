package com.WhiteBox.nov3;

import java.util.ArrayList;

public class Student {
	int id;
	String name;
	
	//create a constructor 
	public Student(int id, String name){
		this.id = id;
		this.name= name;
	}

	public static void main(String[] args) {
	Student s1= new Student(100, "Kirti");
	Student s2= new Student(101, "abhi");
	Student s3= new Student(100, "Ryan");
	Student s4= new Student(100, "Shashi");
	
ArrayList <Student> alist= new ArrayList <Student>();
alist.add( s1);

	}

}
