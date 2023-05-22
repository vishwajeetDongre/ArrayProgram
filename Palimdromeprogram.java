package org.vishwa;
import java.util.*;
public class Palimdromeprogram {

	public static void main(String[] args) {
		int rem,rev=0;
		Scanner S= new Scanner(System.in);
		System.out.println("enter the number");
		int no=S.nextInt();
		int temp=no;
		while(no>0)
		{
			rem=no%10;
			no=no/10;
			rev=rev*10+rem;
		}
		System.out.println(rev);
       if(temp==rev)
       {
    	   System.out.println("number is palimdrome");
       }else
       {
    	   System.out.println("number is not palimdrome");
       }
	}

}
