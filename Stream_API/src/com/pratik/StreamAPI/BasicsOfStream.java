package com.pratik.StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class BasicsOfStream {

	public static void main(String[] args) {
		
		List<Integer> ls=Arrays.asList(10,20,50,30,40);
		//Map
		List<Integer> square=ls.stream().map(x->x*x).collect(Collectors.toList());
		
		square.stream().map(x->x*x).forEach(y->System.out.println("The value is"+y));
		
		//sorted 
		List<Integer> sq=ls.stream().sorted().collect(Collectors.toList());
		System.out.println(sq);
		//printing the map element
		System.out.println(square);
		List<String> lm=Arrays.asList("Pratik","Deshmukh");
		//Filter
		List<String> s=lm.stream().filter(x->x.startsWith("P")).collect(Collectors.toList());
		System.out.println(s);
	}
}
