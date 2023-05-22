package org.Array;
import java.util.*;
public class ArrayCompare {

	public static void main(String[] args) {
		Scanner S= new Scanner(System.in);
		int a[]={10,20,30,40,50};
		int b[]={10,20,30,40,50};
		boolean b1=Arrays.equals(a,b);
		if(b1)
		{
			System.out.println("Array are equal");
		}else
		{
			System.out.println("Array not equals");
		}
		
		int a1[]={10,20,30,40,50};
		int b2[]={10,20,30,50};
		boolean b3=Arrays.equals(a1,b2);
		if(b3)
		{
			System.out.println("Array are equal");
		}else
		{
			System.out.println("Array not equals");
		}
		
		int c[][] =new int[][]{
			{1,2,3},
			{4,5,6},
			{7,8,9}
		};
		int d[][] =new int[][]{
			{1,2,3},
			{4,5,6},
			{7,8,9}
		};
		boolean b4=Arrays.deepEquals(c,d);
		if(b4)
		{
			System.out.println("Array are equal");
		}else
		{
			System.out.println("Array not equals");
		}


	
	int c1[][] =new int[][]{
		{1,2,3},
		{4,5,6},
		{7,8,9}
	};
	int d1[][] =new int[][]{
		{1,2,3},
		{4,5,6},
		{7,9,9}
	};
	
	boolean b5=Arrays.deepEquals(c1,d1);
	if(b5)
	{
		System.out.println("Array are equal");
	}else
	{
		System.out.println("Array not equals");
	}

}
}
