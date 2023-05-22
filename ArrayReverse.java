package org.Array;
import java.util.*;
public class ArrayReverse {

	public static void main(String[] args) {
	Scanner S= new Scanner(System.in);
	 int a[]= {10,20,30,40,50};
	 
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
	 for(int i=0;i<a.length;i++)
	 {
		 System.out.println(a[i]+"\t");
	 }
	 

	}

}
