package com.java.yerin;
import java.util.HashSet;

public class HashSetClass {
	
	public HashSetClass() {
		
		HashSet<String> hashSet = new HashSet<String>();
		
		hashSet.add("str0");
		hashSet.add("str2");
		hashSet.add("str5");
		
		System.out.println(hashSet.toString());
		
		int i = hashSet.size();
		System.out.println("Set계열 구조에서는 데이터의 순서는 없다. 하지만 중복된 데이터는 허락하지 않는다.");
	}

}
