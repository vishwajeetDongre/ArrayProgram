package org.Array;
import java.util.*;
public class SearchArray {

	public static void main(String[] args) {
		int i,flag=0;
		Scanner s=new Scanner(System.in);
		int a[]=new int[5];
		System.out.println("enter the array value");
		for(i=0;i<a.length;i++)
		{
			a[i]=s.nextInt();         // input value
		}
		System.out.println("enter the digit");
		 int digit=s.nextInt();
		for(i=0;i<a.length;i++)
		{ 
			if(a[i]==digit)   // compare value if present
		{    flag=1;
		break;
				
		}	
		}
		if(flag==1)  // print value
		{
			System.out.println("digit found");
		}
		else
		{
			System.out.println("digit not found");
		}
			
		}
		

	}


