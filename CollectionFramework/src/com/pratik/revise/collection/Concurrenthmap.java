package com.pratik.revise.collection;

import java.util.Collections;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class Concurrenthmap {

	public static void main(String[] args) {
		
		ConcurrentHashMap<Integer, String> chm=new ConcurrentHashMap<>();
		
		chm.put(11, "Pratik");
		chm.put(12, "Peter");
		chm.put(13, "praty");
		
		
		//replace
	      chm.replace(12, "Abhi");
		//call the map
		System.out.println(chm.entrySet());
		
		//remove
		chm.remove(12);
		System.out.println(chm.entrySet());
		
		//replace
	      chm.replace(12, "Abhi");
		//methods
		chm.putIfAbsent(14, "Deshmukh");
		System.out.println(chm.entrySet());
		
		//get() methods
		System.out.println(chm.get(14));
		
		//
		for(Map.Entry ch:chm.entrySet()) {
			System.out.println("keyvalues"+ch.getKey()+" "+ch.getValue());
		}
	}

}
