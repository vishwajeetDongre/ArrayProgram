package org.vishwajeet;
import java.util.*;
public class spicifyposition {

	public static void main(String[] args) {
		Scanner S= new Scanner(System.in);
		 System.out.println("enter the Array size");
		 int size=S.nextInt();
		 int a[]=new int[size];
		 for(int i=0;i<a.length-1;i++)
		 {
			a[i]=S.nextInt();
		 }
		 System.out.println("Display Array");
		 for(int i=0;i<a.length-1;i++)
		 {
			System.out.print(a[i]+"\t");
		 }
		 
		 System.out.println("\nenter the index");
		 int index=S.nextInt();
		 System.out.println("enter the value");
		 int value=S.nextInt();
		 
		 for(int i=a.length-2;i>=index;i--)
		 {
			 a[i+1]=a[i];
		 }
		 a[index]=value;
		 
		 System.out.println("after value added");
		 for(int i=0;i<a.length;i++)
		 {
			System.out.print(a[i]+"\t");
		 }

	}

}
