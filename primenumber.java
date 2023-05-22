package org.vishwa;
import java.util.*;
public class primenumber {

	public static void main(String[] args) {
		Scanner S= new Scanner(System.in);
        System.out.println("enter the number");
        int no=S.nextInt();
        boolean flag=true;
        for(int i=2;i<no;i++)
        {
        	if(no%i==0)
        	{
        		flag=false;
        		break;
        	}
        }
        
        if(flag)
        {
        	System.out.println("number is prime ");
        }else
        {
        	System.out.println("number is not prime");
        }
	}

}
