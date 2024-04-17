package com.pratik.revise.collection;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class Hashhset {

	public static void main(String[] args) {
		
		Set<String> hs=new HashSet <String>();
		
		boolean b1=hs.add("Pratik");
		boolean b2=hs.add("Deshmukh");
		boolean b3=hs.add("Pratik");
	
		System.out.println(hs);
		System.out.println(b1);
		System.out.println(b2);
		System.out.println(b3);
		
		
	}

}
