package com.pratik.revise.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FindMaximumNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> lm=new ArrayList<>();
		lm.add(10);
		lm.add(12);
		lm.add(76);
		lm.add(86);
		lm.add(9);
		
		System.out.println(lm);
		int n=Collections.max(lm);
		System.out.println(n);
		

	}

}
