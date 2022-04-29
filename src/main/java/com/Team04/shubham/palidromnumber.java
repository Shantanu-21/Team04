package com.Team04.shubham;

import java.util.Scanner;

public class palidromnumber {

	public static void main(String[] args) {
		 
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter the number");
		
		int num=sc.nextInt();
		
		int org_num=num;
		
		int rev=0;
		
		while (num !=0) {
			
			rev=rev*10 +num%10;
			num=num/10;
		}
		if (org_num == rev) {
			System.out.println("palindrom number:"+org_num);
			
		} else {
            System.out.println("Not palindrom number:"+org_num);
		}
	}
}
