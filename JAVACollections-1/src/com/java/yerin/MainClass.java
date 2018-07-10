package com.java.yerin;
import java.util.ArrayList;


public class MainClass{
	
	public static void main(String[] args) {
		
		ArrayList<String> arrayList = new ArrayList<String>();
		arrayList.add("str1");
		arrayList.add("List계열 자료구조형은 가장 많이 쓰이는 자료구조형이다.");
		arrayList.add("배열과 비슷하지만 처음 만들 때 크기를 고정하지 않아도 된다.");
		arrayList.add("데이터가 중복되어도 상관 없다. 인덱스가 가장 중요하다.");
		
		System.out.println(arrayList);
	}
}