package org.Array;
import java.util.*;
class Infiparatwo
{
	void setvalue(String name,int ...x)// can not pass more than one parameter
	{
		int sum=0;
		for(int i=0;i<x.length;i++)
		{
			sum=sum+x[i];
		}
		System.out.println("name is "+name);
		System.out.println("sum is ="+sum);
	}
	
	
}

public class Infinitytwoparameter {

	public static void main(String[] args) {
		Scanner s=new Scanner (System.in);
		Infiparatwo P=new Infiparatwo();
	    P.setvalue("ramesh",10,20,30,40,50);

	}

}

