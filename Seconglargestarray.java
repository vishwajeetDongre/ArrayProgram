package org.vishwa;
import java.util.*;
public class Seconglargestarray {

	public static void main(String[] args) {
		Scanner S= new Scanner(System.in);
		System.out.println("enter the size of array");
		int size=S.nextInt();
		System.out.println("enter the array value");
		int a[]= new int[size];
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
		
		 System.out.println("second largest element is = "+a[a.length-2]);

	}

}
