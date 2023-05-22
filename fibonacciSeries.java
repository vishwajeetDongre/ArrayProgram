package org.vishwa;
import java.util.*;
public class fibonacciSeries {

	public static void main(String[] args) {
		Scanner S= new Scanner(System.in);
		System.out.println("enter the number");
		int no=S.nextInt();
		int f1=1,f=0,fib;
		System.out.println(f);
		for(int i=0;i<no;i++)
		{
			fib=f+f1;
			f=f1;
			f1=fib;
			System.out.println(fib);
		}

	}

}
