package org.Array;
import java.util.*;

public class Maximunandminimum {

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
       int min=a[0], max=a[0];
      
       for(int i=0;i<size;i++)
       {
    	   if(a[i]>max)
    	   {
    		   max=a[i];
    	   }
    }
       for(int i=0;i<size;i++)
       {
    	   if(a[i]<min)
    	   {
    		   min=a[i];
    	   }
    		   
       }
       System.out.println("maximum value of array is= "+max);
       System.out.println("minimum value of array is = "+min);
	}

}
