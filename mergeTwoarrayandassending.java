package org.Array;
import java.util.*;

public class mergeTwoarrayandassending {

	public static void main(String[] args) {
      int j=0;
       Scanner S= new Scanner(System.in);
       System.out.println("enter the array size");
       int size=S.nextInt();
       int a[]=new int[size];
       int b[]=new int[size];
       int c[]=new int[2*size];

      System.out.println("enter the array value");
      for(int i=0;i<a.length;i++)
      {
    	  a[i]=S.nextInt();
      }
      System.out.println("enter the Second Array");
      for(int i=0;i<a.length;i++)
      {
    	  b[i]=S.nextInt();
      }
      
      for(int i=0;i<a.length;i++)
      {
    	  c[j]=a[i];
    	  j++;
      }
      for(int i=0;i<b.length;i++)
      {
    	  c[j]=b[i];
    	  j++;
      }
      for(int i=0;i<c.length;i++)
      {
    	  System.out.println(c[i]);
      }
      for(int i=0;i<c.length;i++)
      {
    	for(j=(i+1);j<c.length;j++)
    	{
    		if(c[i]<c[j])
    		{
    		int temp=c[i];
    		c[i]=c[j];
    		c[j]=temp;
    		}
    	}
      }
      System.out.println("merge array in desending order");
      for(int i=0;i<c.length;i++)
      {
    	  System.out.print(c[i]);
      }
	}

}
