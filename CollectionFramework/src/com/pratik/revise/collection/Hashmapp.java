package com.pratik.revise.collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Hashmapp {

	public static void main(String[] args) {


		 Map<Integer, String> m=new HashMap<>();
		 Map mn=new HashMap();
		 m.put(1, "Pratik");
		 m.put(2, "Rahul");
		 m.put(3, "Ninad");
		 
		 System.out.println(m);
		 
		 
		 
		 //proper ways to call map
		 //get the keys
		 System.out.println("keys"+m.keySet());
		 
		 //get the values
		 System.out.println("values"+m.values());
		 
		 //key values
		 System.out.println("Keyvalues"+m.entrySet());
		 
		 //first
		 Set set1=m.entrySet();
		 Iterator itr1=set1.iterator();
		 while(itr1.hasNext()){
			 Map.Entry ent=(Map.Entry)itr1.next();
			 System.out.println(ent.getKey()+" "+ent.getValue());
			
	  //second
			 for(Map.Entry m1:m.entrySet()){  
				   System.out.println(m1.getKey()+" "+m1.getValue());  
				  }  
		 }
	}

}
