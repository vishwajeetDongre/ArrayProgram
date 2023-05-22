package org.vishwa;
import java.util.*;
public class movezerolast {

	public static void main(String[] args) {
		Scanner S= new Scanner(System.in);
		System.out.println("enter the size of array");
		int size=S.nextInt();
		int a[]=new int[size];
		System.out.println("enter the Array value");
		for(int i=0;i<a.length;i++)
		{
			a[i]=S.nextInt();
		}
		int count=0;
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length;j++)
			{
				
		
			if(a[i]==0)
			{
				a[i]=a[i+1];
				count++;
				
			}
			a[i+1]=a[i+2];
			}
	    }
		
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}

	}

}