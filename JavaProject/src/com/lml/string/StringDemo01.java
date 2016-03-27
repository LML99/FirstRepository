package com.lml.string;

public class StringDemo01 {

	public static void main(String[] args) {
		//String “==”比较的是地址
		String str1="hello";
		String str2=new String("hello");
		System.out.println(str1==str2);		// false
		
		//String 内容不可以更改（注意内存当中的变化）
		//StringBuffer 可以改变内容
		String str="hello";
		String strNew=str+" world";
		
		StringBuffer sb=new StringBuffer();
		sb.append("hello");
		sb.append(" world");
		
		System.out.println(strNew);
		System.out.println(sb);
		
	}

}
