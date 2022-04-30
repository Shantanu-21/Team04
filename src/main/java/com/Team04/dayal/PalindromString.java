package com.Team04.dayal;

import java.util.Scanner;

public class PalindromString {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Your String");
		
		String str=sc.next();
		
		String org_str=str;
		
		String rev="";
		
		int len=str.length();
		
		for(int i=len-1;i>=0;i--) {
			
			rev= rev+str.charAt(i);
		}
		
		if(org_str.equals(rev)) {
			System.out.println("is Palidrome String" + org_str);
		}else {
			System.out.println("is not Palidrome String" + org_str);
		}
	}

}
