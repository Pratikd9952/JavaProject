package com.pratik.Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import com.pratik.StreamAPI.pp.Product;

public class ProductMain {

	public static void main(String[] args) {
		
		List<Product> prd=new ArrayList<>();
		
		prd.add(new Product(1, "Sugar", "s1", 10, 101));
		prd.add(new Product(2, "besan", "b1", 20, 220));
		prd.add(new Product(3, "Shaubu", "sm", 28, 301));
		prd.add(new Product(4, "ratale", "r1",38, 333));
		
		Collections.sort(prd, new PriceI());
	
		Iterator itr=prd.iterator();
		while(itr.hasNext()) {
			Product pd=(Product)itr.next();
			System.out.println(pd);
			
		}
		for(Product p:prd) {
			System.out.println(p.);
		}
	   //Collections.sort(prd, new qtycomparator());
		
		//Collections.sort(prd, new idcamparator());

		}
	}
