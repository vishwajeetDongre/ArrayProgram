package org.Array;
import java.util.*;
public class jagarray {

	public static void main(String[] args) {
		Scanner S= new Scanner(System.in);
		
      int a[][]= new int[3][];
      a[0]= new int[2];
      
      a[1]= new int[4];
      
      a[2]=new int[3];
      System.out.println("enter the Array value");
      for(int i=0;i<a.length;i++)
      {
    	  for(int j=0;j<a[i].length;j++)
    	  {
    		  a[i][j]=S.nextInt();
    	  }
      }
      for(int i=0;i<a.length;i++)
      {
    	  for(int j=0;j<a[i].length;j++)
    	  {
    		  System.out.print(a[i][j]+"\t");
    	  }
    	  System.out.println("");
      }
	}

}
