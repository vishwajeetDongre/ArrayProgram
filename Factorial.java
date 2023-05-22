package org.vishwa;
import java.util.*;
public class Factorial {

	public static void main(String[] args) {
		Scanner S= new Scanner(System.in);
		System.out.println("enter the number");
		int no=S.nextInt();
		int fact=1;
		for(int i=1;i<=no;i++)
		{
			fact=fact*i;
			
		}
		System.out.println(fact);

	}

}
