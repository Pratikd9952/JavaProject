package com.pratik.Comparator;

import java.util.Comparator;

public class PriceI implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		Product p1=(Product)o1;
		Product p2=(Product)o2;
		
		if(p1.price>p2.price)
			return 1;
		return 0;
		}

}
