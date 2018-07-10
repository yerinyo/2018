package com.java.yerin;
import java.util.Iterator;
import java.util.ArrayList;

public class IteratorClass {
	
	public IteratorClass() {
		
		ArrayList<String> arrayList = new ArrayList<String>();
		arrayList.add("str0");
		arrayList.add("str2");

		Iterator<String> iterator = arrayList.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}

}
