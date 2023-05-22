package org.Array;
import java.util.*;

import java.util.Scanner;

public class AssendingOrderArray {

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
       for(int i=0;i<a.length;i++)
       {
    	   for(int j=(i+1);j<a.length;j++)
    	   {
    		   if(a[i]>a[j])
    		   {
    			  int  temp=a[i];
    			   a[i]=a[j];
    			   a[j]=temp;
    		   }
    	   }
       }
       for(int i=0;i<a.length;i++)
       {
    	   System.out.println(a[i]);
       }

	}

}
