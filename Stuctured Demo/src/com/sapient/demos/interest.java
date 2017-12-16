package com.sapient.demos;

import java.util.Scanner;

public class interest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("enter the amount");
		double pamt=s.nextDouble();
		System.out.println("enter the years");
		int terms=s.nextInt();
		System.out.println("enter the rate");
		float per=s.nextFloat();
		
		double simple= calcSimple(pamt,terms,per);
		double com= calcCompound(pamt,terms,per);
		System.out.println("Simple Interest"+simple);
		System.out.println("Compound Interest"+com);
		s.close();

	}

	public static double calcSimple(double amt, int years, float rate){
		double si=amt*years*rate/100;
		return si;
		
		
		
	}
	public static double calcCompound(double amt, int years, float rate){
		double ci= amt * Math.pow((1+rate/100),years);
		return ci;
	}
}
