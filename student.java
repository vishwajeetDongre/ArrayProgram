package org.Array;
import java.util.*;
class Student3
{
	private int a[],max,i,agg=0,per;
	public
	void SubMarks(int a[])
	{   this.a=a;
		
	}
	void Calculateper()
	{
		for(i=0;i<a.length;i++)
		{
			agg+=a[i];
			
		}
		per=agg/a.length;
	}
	void CheckGread()
	{
		if( per>75 && per<=100)
		{
			System.out.println("distingtion");
		}
		else if(per>60 && per<=75)
		{
			System.out.println("first Division");	
		}
		else if(per>=50 && per<=60)
		{
			System.out.println("Second Division");	
		}
		else if(per>=40 && per<=50)
		{
			System.out.println("Third Division");	
		}
		else if(per>=0 && per<=35)
		{
			System.out.println("Fail");	
		}
		
	}

}
public  class student {

	public static void main(String[] args) {
		int i;
		Scanner s=new Scanner(System.in);
		Student3 s1=new Student3();
		int a[]=new int[6];
		for(i=0;i<a.length;i++)
		{
			a[i]=s.nextInt();
		}
		
        s1.SubMarks(a);
        s1.Calculateper();
        s1.CheckGread();
	}

}

