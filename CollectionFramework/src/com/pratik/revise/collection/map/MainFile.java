package com.pratik.revise.collection.map;

import java.util.HashMap;
import java.util.Map;

public class MainFile {

	public static void main(String[] args) {
		
		//Entity em=new Entity(null, null, 0, 0);
		Map<Integer, Entity> mn=new HashMap<>();
		
		//adding details
		Entity en=new Entity("Chem","Cm1",1001,10);
		Entity en1=new Entity("Bio","b1",2001,20);
		
		//adding details on map
		mn.put(101, en);
		mn.put(102, en1);
		
		
		for(Map.Entry<Integer, Entity>eky:mn.entrySet()) {
			int key=eky.getKey();
			Entity e=eky.getValue();
			
			System.out.println(key);
			System.out.println(e.Book+" "+e.BookId+" "+e.bookNo+" "+e.bookoty);
			
		}
		// writing method not applicable for map.
		//if we have added key and value in same put method then we can go for this
		for(Map.Entry m1:mn.entrySet()){  
			   System.out.println(m1.getKey()+" "+m1.getValue());  
			  }  
		
	}

}
