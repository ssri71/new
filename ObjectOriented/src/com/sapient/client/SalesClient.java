package com.sapient.client;
import com.sapient.service.SalesPerson;

public class SalesClient {
public static void main(String args[])
{
	//default constructor
	/*SalesPerson s1=new SalesPerson();
	s1.id=1001;
	s1.name="ram";
	s1.samt=45000;
	double sc=s1.calcSalesComm();
	System.out.println(sc);*/
	SalesPerson s1=new SalesPerson(1001,"ram",45000);
	SalesPerson s2=new SalesPerson(1002,"shyam",55000);
	SalesPerson s3=new SalesPerson(1003,"gopal",67000);
	s1.display();
	s2.display();
	s3.display();
	System.out.println("no. of persons"+SalesPerson.noofpersons);
	System.out.println("Total Sales"+SalesPerson.totsales);
	
}

}
