package org.Array;
import java.util.*;
public class aray {

	public static void main(String[] args) {
		Scanner S= new Scanner(System.in);
		int a[]= {10,20,30,40};
		int b[];
		b=a;
		a=new int[] {60,70   };
		for(int i=0;i<a.length;i++)
		{
			System.out.println(b[i]+"\t");
		}

	}

}
