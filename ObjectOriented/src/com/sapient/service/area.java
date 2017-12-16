package com.sapient.service;
import java.util.*;
public class area {
	public static void main(String[] args) {
		System.out.println("enter the radius");
		Scanner s=new Scanner(System.in);
		double r=s.nextDouble();
		double a= circArea(r);
		double p= circPeri(r);
		System.out.println("area is"+a);
		System.out.println("perimeter is"+p);
		
	}
	public static double circArea(double r){
		double ar=(22/7)*r*r;
		return ar;
		
	}
	public static double circPeri(double r){
		double pr=2*(22/7)*r;
		return pr;
	}
}
