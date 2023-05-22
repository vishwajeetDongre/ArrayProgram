package org.vishwajeet;
import java.util.*;
public class ReverseNumber {

	public static void main(String[] args) {
		 Scanner S= new Scanner(System.in);
		 System.out.println("enter the Array size");
		 int size=S.nextInt();
		 int a[]=new int[size];
		 for(int i=0;i<a.length;i++)
		 {
			a[i]=S.nextInt();
		 }
		 int start=0;
		 int mid=a.length/2;
		 int end=a.length-1;
		 
		 for(start=0;start<mid;start++)
		 {
			 int temp=a[start];
			 a[start]=a[end];
			 a[end]=temp;
			 end--;
		 }
		 System.out.println("reverse number is ");
		 for(int i=0;i<a.length;i++)
		 {
			System.out.print(a[i]+"\t");
		 }

	}

}
