package com.sapient.service;

public class interest {
	public double amt;
	public int years;
	public float rate;
	

	public double calcSi(){
		double si=amt*years*rate/100;
		return si;
	}
	public double calcCi(){
		double ci=amt*Math.pow(1+rate/100,years);
		return ci;
	}
}
