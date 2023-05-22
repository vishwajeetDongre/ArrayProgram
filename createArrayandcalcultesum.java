package org.vishwajeet;
import java.util.*;
public class createArrayandcalcultesum {

	public static void main(String[] args) {
		int sum=0;
		Scanner S= new Scanner(System.in);
		 System.out.println("enter the Array size");
		 int size=S.nextInt();
		 int a[]=new int[size];
		 for(int i=0;i<a.length;i++)
		 {
			a[i]=S.nextInt();
		 }
		 
		 
		 for(int i=0;i<a.length;i++)
		 {
			sum=sum+a[i];
		 }
		 System.out.println("sum  of array element is  ="+sum);

	}

}
