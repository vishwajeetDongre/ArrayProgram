package org.Array;
import java.util.*;

public class MissingElement {

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

       for(int i=0;i<a.length-1;i++) {
    	   int r=a[i+1]-a[i];
    	   if(r>1) {
    	   for(int j=a[i];j<a[i+1]-1;)
    	   {
    		   System.out.println(++j);
    	   }
    	   }
       }
	}

}
