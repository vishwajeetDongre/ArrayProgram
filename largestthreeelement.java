package org.vishwa;
import java.util.*;
public class largestthreeelement {

	public static void main(String[] args) {
		Scanner S= new Scanner(System.in);
		System.out.println("enter the size of Array");
		int size=S.nextInt();
		int a[]=new int[size];
		for(int i=0;i<a.length;i++)
		{
			a[i]=S.nextInt();
		}
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]>a[j])
				{
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
		
		System.out.println("largest three element is ");
		for(int i=a.length-1;i>a.length-4;i--)
		{
			System.out.println(a[i]);
		}

	}

}
