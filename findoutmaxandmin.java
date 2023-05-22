package org.vishwajeet;
import java.util.*;
public class findoutmaxandmin {

	public static void main(String[] args) {
		Scanner S= new Scanner(System.in);
		 System.out.println("enter the Array size");
		 int size=S.nextInt();
		 int a[]=new int[size];
		 for(int i=0;i<a.length;i++)
		 {
			a[i]=S.nextInt();
		 }
		 
		 int max=a[0];
		 for(int i=0;i<a.length;i++)
		 {
			 if(a[i]>max)
			 {
				 max=a[i];
			 }
		 }
		 int min=a[0];
		 
		 for(int i=0;i<a.length;i++)
		 {
			 if(a[i]<min)
			 {
				 min=a[i];
			 }
		 }
		 System.out.println("maximum element in arry = "+max);
		 System.out.println("minimum element in arry = "+min);

	}

}
