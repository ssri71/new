package com.sapient.service;

public class SalesPerson {
	public int id;
	public String name;
	public double samt;
	public static int noofpersons;
	public static double totsales;
	
	public SalesPerson(int id, String name, double samt)
	{
		super();
		this.id=id;
		this.name=name;
		this.samt=samt;
		++noofpersons;
		totsales=totsales+samt;
		
	}
	
	public double calcSalesComm(){
		//double sc=0;
		if(samt>=50000)
		return 0.1*samt;
		else if(samt>=20000)
			return 0.05*samt;
		    else
			return 0.03*samt;
	}
	
	public void display()
	{
		System.out.println("");
	}

}
