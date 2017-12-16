package com.sapient.service;

import java.util.Scanner;

public class Student {

	public static void main (String args[])throws Exception
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter first value");
		int v1=s.nextInt();
		System.out.println("enter second value");
		int v2=s.nextInt();
		System.out.println("Choose 1--ADD\n 2--SUB\n 3--MULTIPLY\n");
		String str=s.next();
		
		try{
			Menu menu=Menu.valueOf(str);
		switch(menu){
		case ADD:
			System.out.println("Add"+(v1+v2));
			break;
		case SUB:	
			System.out.println("Subtraction"+(v1-v2));
			break;
		case MULTIPLY:
			System.out.println("Multiply"+(v1*v2));
			break;
		
		    
		
		}
		}
		catch(Exception e){
			
			System.out.println("invalid");
		}
		
		
		
	}
	
}
enum Menu{
	ADD, SUB, MULTIPLY
}
