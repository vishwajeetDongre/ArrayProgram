package org.Array;
import java.util.*;
public class Arraylegaldeclaration {

	public static void main(String[] args) {
		Scanner S= new Scanner(System.in);
		int a[]=new int[] {1,2,3,4};
		int b[]=new int[a.length];
		System.out.println("manual method");
		for(int i=0;i<a.length;i++)
		{
			b[i]=a[i];
		}
         
		for(int i=0;i<b.length;i++)
		{
			System.out.println(b[i]);
		}
		int c[]=new int[] {1,2,3,4,5,6,};
		int d[]=Arrays.copyOf(c,c.length);
		System.out.println("array method");
		for(int i=0;i<d.length;i++)
		{ 
			System.out.println(d[i]);
		}

	}

}
