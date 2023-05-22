package org.Array;
import java.util.*;
class InsertArray
{
	private int c[],i,index,value;
	public void SetIntArray(int c[])
	{
		this.c=c;
	}
	void InsertValueIndex(int index,int value)
	{ 
		
		    
		for(i=c.length-1;i<index;i--)
		{
			c[i-1]=c[i];
		}
		c[index]=value;
		System.out.println("print in after add value");
		for(i=0;i<c.length;i++)
		{
			System.out.println(+c[i]);
		}
	}
}

public class InsertArratelement {

	public static void main(String[] args) {
		int i;
		Scanner S=new Scanner(System.in);
		InsertArray  I=new InsertArray();
		int c[]=new int[5];
		System.out.println("enter the array value");
		for(i=0;i<c.length;i++)
		{
			c[i]=S.nextInt();
		}
		I.SetIntArray(c);
		
		
		System.out.println("enter the index and value");
		int  index=S.nextInt();
		
		int value=S.nextInt();
		I.InsertValueIndex(index,value);

	}

}
