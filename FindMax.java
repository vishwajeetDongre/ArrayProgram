package org.Array;
import java.util.*;
class FindMaxApp
{
	int b[],Max,i;
	void setvalue(int b[])
	{
		this.b=b;
	}
	void getMax()
	{ 
		Max=b[0];
		for(i=0;i<b.length;i++)
		{
		if(b[i]>Max)
		{
			Max=b[i];
		}
		}
	System.out.println("MIXIMUM NUMBER IS ="+Max);
	}
}


public class FindMax{

	public static void main(String[] args) {
		 Scanner s=new Scanner(System.in);
		 FindMaxApp f=new FindMaxApp();
		 int b[]= new int[5];
		 System.out.println("enter the array value");
		 for(int i=0;i<b.length;i++)
		 {
			 b[i]=s.nextInt();
		 }
	    f.setvalue(b);
	    f.getMax();

	}
}


