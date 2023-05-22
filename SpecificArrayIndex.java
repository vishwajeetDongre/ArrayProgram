package org.Array;
import java.util.*;

public class SpecificArrayIndex {

	public static void main(String[] args) {
		Scanner S= new Scanner(System.in);
		System.out.println("enter the Array size");
		
       int size=S.nextInt();
       int a[]=new int[size];
       System.out.println("enter the array value");
       for(int i=0;i<a.length-1;i++)
       {
    	   a[i]=S.nextInt();
       }
       System.out.println("enter the index and value");
       int index=S.nextInt();
       int value=S.nextInt();
       for(int i=a.length-2;i>=index;i--)
       {
    	   a[i+1]=a[i];
       }
       a[index]=value;
       for(int i=0;i<a.length;i++)
       {
    	   System.out.println(a[i]);
       }

	}

}
