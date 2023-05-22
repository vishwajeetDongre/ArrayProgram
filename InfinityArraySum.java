package org.Array;
import java.util.*;
class Sum
{
	private int a[],sum=0,i;
	public
	void getdata(int ...a)
	{
		this.a=a;
	}
	void showdata()
	{ 
		for(i=0;i<a.length;i++)
	     {
		    sum=sum+a[i];
	     }
		System.out.println("sum of infinirty array is ="+sum);
	}
}

public class InfinityArraySum {

	public static void main(String[] args) {
		int i;
		Scanner S=new Scanner(System.in);
		Sum s1= new Sum();
		int a[]=new int[5];
		System.out.println("enter the number");
		for(i=0;i<a.length;i++)
		{
			a[i]=S.nextInt();
		}
       s1.getdata(a);
       s1.showdata();
	}
	

}
