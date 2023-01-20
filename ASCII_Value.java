package com.demo;

import java.util.Scanner;

public class ASCII_Value {

	public static void main(String[] args) {
		
		char ch;
		System.out.println("Enter any character");
		Scanner sc=new Scanner(System.in);
		ch=sc.next().charAt(0);
		
		int as=ch;
		System.out.println("ASCII Value of "+ch+" is "+ as);
		

	}

}
