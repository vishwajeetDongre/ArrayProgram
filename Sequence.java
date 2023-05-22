package org.Array;
import java.util.*;
class Sequence1
{
	private int a[],i,j=0;
	public void  setvalue(int a[])
	{
		this.a=a;
	}
	 void showvalue()
	 {
	 for(i=0;i<a.length-2;i++)
	 {
		 for(j=i+1;j<a.length-2;j++)
		 {
		if(a[i]==a[j])
		{
			a[i]=a[j];
		}
		else
		{
			a[i]=a[j];
		}
		 }
		 
	 }
	 System.out.println("Display the array");
	 
		 for(i=0;i<a.length-2;i++)
		 {
			 System.out.println(a[i]);
		 }
	 
}
}

public class Sequence {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		Sequence1 s1=new Sequence1();
		int a[]=new int[7];
		System.out.println("etnter the array value");
		for(int i=0;i<a.length-2;i++)
		{
			a[i]=s.nextInt();
		}
		
		s1.setvalue(a);
		s1.showvalue();

	}

}
