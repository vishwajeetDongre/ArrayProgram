package org.vishwajeet;
import java.util.*;
public class ArrayinAssendingorder {

	public static void main(String[] args) {
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
		 
		 System.out.println("assending order in Array is ");
		 for(int i=0;i<a.length;i++)
		 {
			System.out.print(a[i]+"\t");
		 }

	}

}
