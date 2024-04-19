package com.pratik.Comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StudentMain {

	public static void main(String[] args) {
		
		List<Student> str=new ArrayList<>();
		
		str.add(new Student(10, "Pratik", 33, "Deshmukh"));
		str.add(new Student(20, "Peter", 44, "Saxena"));
		str.add(new Student(25, "Pratu", 55, "Deshmukh"));
		str.add(new Student(31, "Prakash", 66, "Gore"));
		
		Collections.sort(str);
		
		for(Student st:str) {
			System.out.println(st.age+" "+st.name+" "+st.no+" "+st.surname);
		}
		
//		/System.out.println(str);
	}

}
