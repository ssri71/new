package com.sapient.client;
import com.sapient.service.interest;

import com.sapient.util.saputil;

public class InterestClient {
	public static void main(String[] args)
	{
		interest i=new interest();
		i.amt=1000;i.years=5;i.rate=5;
		System.out.println("CI-"+saputil.roundup2dec(i.calcCi()));
		System.out.println("SI-"+saputil.roundup2dec(i.calcSi()));
	}

}
