package com.lml.string;

public class StringDemo01 {

	public static void main(String[] args) {
		//String ��==���Ƚϵ��ǵ�ַ
		String str1="hello";
		String str2=new String("hello");
		System.out.println(str1==str2);		// false
		
		//String ���ݲ����Ը��ģ�ע���ڴ浱�еı仯��
		//StringBuffer ���Ըı�����
		String str="hello";
		String strNew=str+" world";
		
		StringBuffer sb=new StringBuffer();
		sb.append("hello");
		sb.append(" world");
		
		System.out.println(strNew);
		System.out.println(sb);
		
	}

}
