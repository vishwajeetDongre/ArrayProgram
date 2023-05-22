package org.Array;
import java.util.*;
public class palimdrome {

	public static void main(String[] args) {
		int rev=0,rem;
		Scanner S= new Scanner(System.in);
		System.out.println("enter the number the number");
		int no=S.nextInt();
		int temp=no;
		while(no>0)
		{
			rem=no%10;
			no=no/10;
			rev=rem+rev*10;
			
		}
		if(rev==temp)
		{
			System.out.println("number is palimdrome");
		}else
		{
			System.out.println("number is not palimdrome");
		}

	}

}
