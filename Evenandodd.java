package org.Array;
import java.util.*;

public class Evenandodd {

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
       System.out.println("even number is ");
       for(int i=0;i<a.length;i++)
       {
    	   if(a[i]%2==0)
    	   {
    		   System.out.print(a[i]+"\t");
    	   }
       }
       System.out.println("\n odd number is ");
       for(int i=0;i<a.length;i++)
       {
    	   if(a[i]%2==1)
    	   {
    		   System.out.print(a[i]+"\t");
    	   }
       }
       

	}

}
