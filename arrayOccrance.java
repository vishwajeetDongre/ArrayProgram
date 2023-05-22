package org.vishwajeet;
import java.util.*;
public class arrayOccrance {

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
			 for(int j=i+1;j<a.length;j++)
			 {
				 if(a[i]>a[j])
				 {
					 int temp=a[i];
					 a[i]=a[j];
					 a[j]=temp;
				 }
			 }
		 }
		 int count=1;
		 for(int i=0;i<a.length;i++)
		 {
			 for(int j=i+1;j<a.length;j++)
			 {
				 if(a[i]==a[j])
				 {
					 count++;
					 i++;
				 }else
				 {
					 System.out.println(a[i]+"======>"+count);
					 count=1;
					 i++;
				 }
			 }
			 if(a[i]!=0)
			 {
				 System.out.println(a[i]+"======>"+count);
			 }
		 }
	}

}
