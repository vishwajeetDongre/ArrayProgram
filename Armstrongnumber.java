package org.Array;
import java.util.*;
public class Armstrongnumber {

	public static void main(String[] args) {
		int count=0,rem, sum=0,sum1=0;
		Scanner S= new Scanner(System.in);
		System.out.println("enter the number");
		int no=S.nextInt();
		int temp=no;
		while(no>0)
		{
			
			no=no%10;
			no--;
			count++;
			
		}
		no=temp;
		while(no>0)
		{
			rem=no%10;
		sum+=Math.pow(rem,count);	
		    no=no/10;	
		}
		if(temp==sum)
		{
			System.out.println("number is Armstrong");
		}else
		{
			System.out.println("number is not Armstrong");
		}

	}

}
