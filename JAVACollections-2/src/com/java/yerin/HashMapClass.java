package com.java.yerin;

import java.util.HashMap;
import java.util.Iterator;

public class HashMapClass {

	public HashMapClass() {
		HashMap<Integer, String> hashMap = new HashMap<Integer, String>();
		hashMap.put(0, "str0");
		hashMap.put(2, "str2");
		
		System.out.println(hashMap.toString());
		
		hashMap.remove(2);
		System.out.println(hashMap.toString());
		
		Iterator<Integer> iterator = hashMap.keySet().iterator();
		while(iterator.hasNext()) {
			System.out.println(hashMap.get(iterator.next()));
		}
	}
}
