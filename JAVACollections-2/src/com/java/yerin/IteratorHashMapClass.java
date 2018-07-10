package com.java.yerin;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;


public class IteratorHashMapClass {
	
	public IteratorHashMapClass() {
		
		HashMap<Integer, String> hashMap = new HashMap<Integer, String>();
		hashMap.put(1,  "str0");
		hashMap.put(3,  "str3");
		hashMap.put(5,  "str5");
		
		System.out.println(hashMap.toString());
		
		Set<Integer> set = hashMap.keySet();
		Iterator<Integer> iterator = set.iterator();

		while (iterator.hasNext()) {
			Integer key = iterator.next();
			System.out.println(key + ":" + hashMap.get(key));
		}
	}

}
