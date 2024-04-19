package com.pratik.Comparator;

import java.util.Comparator;

public class idcamparator implements Comparator  {

	@Override
	public int compare(Object o1, Object o2) {
		Product p1=(Product)o1;
		Product p2=(Product)o2;
		
		if(p1.id>p2.id)
			return 1;
		else if(p1.id==p2.id)
			return 0;
		else
		return -1;
	}

	
}
