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
		System.out.println("Set�迭 ���������� �������� ������ ����. ������ �ߺ��� �����ʹ� ������� �ʴ´�.");
	}

}
