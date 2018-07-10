package com.java.yerin;
import java.util.LinkedList;

public class Link {

	public Link() {
		
		LinkedList<String> linkedList = new LinkedList<String>();
		linkedList.add("str1");		
		linkedList.remove(1);
		linkedList.set(2, "str2");
		
		linkedList.add("ArrayList와 비슷하지만 속도가 떨어진다.");
		linkedList.add("ArraList보다 멀티스레드 환경에서는 안전하다.");

	}
	
}
