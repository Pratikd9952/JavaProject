package com.pratik.Comparable;

public class Student implements Comparable<Student>{
	
	int no;
	String name;
	int age;
	String surname;
	
	public Student(int no, String name, int age, String surname) {
		super();
		this.no = no;
		this.name = name;
		this.age = age;
		this.surname = surname;
	}

	

	@Override
	public String toString() {
		return "Student [no=" + no + ", name=" + name + ", age=" + age + ", surname=" + surname + "]";
	}



	@Override
	public int compareTo(Student o) {
		if(age==o.age)
			return 0;
		else if(age>o.age)
			return 1;
		else 
			return -1;
		
	}
	
	
	

}
