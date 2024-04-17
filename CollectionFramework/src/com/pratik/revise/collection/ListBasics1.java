package com.pratik.revise.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class ListBasics1 {

	public static void main(String[] args) {

		List<Integer> ls=new ArrayList<>();
		
		List<String> ll=new LinkedList<>();
		
		//convert arrays to collection with arrays.aslist().
		Integer[] am=new Integer[] {10,20,10,233};
		List<Integer> lm=Arrays.asList(am);
		ll.add("Pratik");
		ll.add("Deshmukh");
		
		System.out.println(ll);
		for(int i=1; i<8; i++) {
			 ls.add(i);
		}
		System.out.println(ls);
		ls.remove(5);
		
		int n=Collections.max(ls);
		System.out.println(n);
		
		System.out.println(ls);
		
		
		for(int i=1; i<ls.size(); i++) {
		
			System.out.println(ls.get(i)+"");
		}
	}

}
