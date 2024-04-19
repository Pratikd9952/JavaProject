package com.pratik.StreamAPI.pp;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ProductMain {

	public static void main(String[] args) {
		
		List<Product> pp=new ArrayList<>();
		
		pp.add(new Product(1, "Mahabharat", "Prt", 1000, 10));
		pp.add(new Product(2, "Shala", "spune", 2000, 20));
		pp.add(new Product(3, "Shjuhd", "value", 2003, 28));
		pp.add(new Product(4, "Scodj", "doing", 3000, 23));
		pp.add(new Product(5, "daring", "s1mai", 4002, 30));
		
		//List<Product> lm=pp.stream().sorted().collect(Collectors.toList());
		
		List<Product> lm1=pp.stream().filter(p->p.price>2000).collect(Collectors.toList());
		
		System.out.println(lm1);
	}

}
