package com.java.yerin;

import java.io.InputStream;
import java.io.OutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class CountClass {
	
	public static void main(String args[]) {
	
	InputStream is = null;
	OutputStream os = null;
	
	try {
		is = new FileInputStream("C:\\Users\\Yerin\\Desktop\\memo.txt");
		os = new FileOutputStream("C:\\Users\\Yerin\\Desktop\\memocopyfile.txt");
		
		byte[] bs = new byte[3];
		
		while(true) {
			int count = is.read(bs);
			if (count == -1) break;
			
			os.write(bs,  0,  count);
		}
	} catch(Exception e) {
		System.out.println(e.getMessage());
	} finally {
		if(is != null) {
			try {
			is.close();
			} catch(Exception e2) {
				System.out.println(e2.getMessage());
			}
		}
		if(os != null) {
			try {
			os.close();
			} catch(Exception e2) {
				System.out.println(e2.getMessage());
			}
		}
	
	}
	
  }
}
