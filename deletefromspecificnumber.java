package org.Array;
import java.util.*;
public class deletefromspecificnumber {

	public static void main(String[] args) {
		Scanner S= new Scanner(System.in);
		System.out.println("enter the Array size");
		
       int size=S.nextInt();
       int a[]=new int[size];
       System.out.println("enter the array value");
       for(int i=0;i<a.length;i++)
       {
    	   a[i]=S.nextInt();
       }
       for(int i=0;i<a.length;i++)
       {
       System.out.println(a[i]+"\t");
       }
       System.out.println("enter the value u want to delete");
       int value=S.nextInt();
       int index=0;
       for(int i=0;i<a.length;i++)
       {
    	   if(value==a[i])
    	   {
    		   index=i;
    	   }
       }
       System.out.println(index);
       for(int i=index;i<a.length-1;i++)
       {
         a[i]=a[i+1];
       }
      
       for(int i=0;i<a.length-1;i++)
       {
    	   System.out.print(a[i]+"\t");
       }

	}

}
