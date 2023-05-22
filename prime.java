package org.vishwajeet;
import java.util.*;
public class prime{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter the number: ");
		int n = in.nextInt();
		
		for(int i=2; i<n; i++)
		{
			boolean b = true;
			for(int j=2; j<i; j++)
			{
				if(i%j==0)
				{
					 b = false;
					break;
				}
			}
			if(b)
			{
				System.out.println(i);
			}
		}
	}
}