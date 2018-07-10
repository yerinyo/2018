package com.java.yerin;
import java.util.HashSet;
public class MainClass {

	public static void main(String[] args) {
		
		HashSet<Student> hashSet = new HashSet<Student>();
		hashSet.add(new Student("홍길동", 3));
		hashSet.add(new Student("박지환", 1));
		hashSet.add(new Student("이예린", 6));
		
	}
}
