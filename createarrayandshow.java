package org.vishwajeet;
import java.util.*;
public class createarrayandshow {

	public static void main(String[] args) {
		 Scanner S= new Scanner(System.in);
		 System.out.println("enter the Array size");
		 int size=S.nextInt();
		 int a[]=new int[size];
		 for(int i=0;i<a.length;i++)
		 {
			a[i]=S.nextInt();
		 }
		 
		 for(int i=0;i<a.length;i++)
		 {
			System.out.println(a[i]);
		 }
		 

	}

}
