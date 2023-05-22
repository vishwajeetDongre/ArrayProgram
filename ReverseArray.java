package org.Array;
import java.util.*;

public class ReverseArray {

	public static void main(String[] args) {
		Scanner S= new Scanner(System.in);
		System.out.println("enter the Array size");
		
       int size=S.nextInt();
       int a[]=new int[size];
       System.out.println("enter the array value");
       for(int i=0;i<size;i++)
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
       for(int i=0;i<a.length;i++)
       {
       System.out.println(a[i]);
       }

	}

}
