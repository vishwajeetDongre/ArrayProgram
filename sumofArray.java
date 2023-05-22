package org.Array;
import java.util.*;

public class sumofArray {

	public static void main(String[] args) {
		int sum=0;
		Scanner S=new Scanner(System.in);
		System.out.println("enter the array size");
		int size=S.nextInt();
		int a[]=new int[size];
		System.out.println("enter the Array value");
		for(int i=0;i<size;i++)
		{
			a[i]=S.nextInt();
		}
		
		for(int i=0;i<size;i++)
		{
			sum=sum+a[i];
		}
		System.out.println(sum);
		

	}

}
