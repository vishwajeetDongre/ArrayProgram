package org.Array;
import java.util.*;

public class Mobileno {

	public static void main(String[] args) {
		int i;
		String data=null;
		Scanner S=new Scanner(System.in);
		//int a[]=new int[12];
		System.out.println("enter the mobile number");
		
		
		 data=S.nextLine();
		
		char ch[]=data.toCharArray();
		System.out.println("mobile number is");
		for(i=0;i<ch.length;i++)
		{
       System.out.print(ch[i]);
		}
		System.out.println("\n");

       for(i=0;i<ch.length;i++)
       {
    	   if(i<=2)
    	   {
    		   System.out.print(ch[i]);
    	   }
    	   else if(i<8)
    	   {
    		   System.out.print("*");
    	   }
    	   else
    	   {
    		   System.out.print(ch[i]);
    	   }
       }
		
	}

}
