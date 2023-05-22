package org.Array;
import java.util.*;
class Frequency
{
	private int c[],count=1,i,j,temp;
	public void setintArray(int c[])
	{
		this.c=c;
	}
	void CountFrequency()
	{
		
		System.out.println("frequency is");
		for(i=0;i<c.length-1;i++)
		{
			
			
			if(c[i]==c[i+1])
			{
				count++;
			}
			else
			{
				System.out.printf(" %d-->%d\n",c[i],count);
				count=1;
			
			}
		
		}
	}
}

public class Frequencycount {

	public static void main(String[] args) {
		int i,j;
		Scanner S=new Scanner(System.in);
		Frequency F=new Frequency();
		int c[]=new int[7];
		System.out.println("enter the array value");
		for(i=0;i<c.length-1;i++)
		{
			c[i]=S.nextInt();
		}
		System.out.println("soarting of array");
		for(i=0;i<6;i++)
		{
			for(j=(i+1);j<6;j++)
			{
				if(c[i]>c[j])
				{
					int temp=c[i];
					c[i]=c[j];
					c[j]=temp;
				}
				
			}
		}
		for(i=0;i<6;i++)
		{
			System.out.printf("%d\n",c[i]);
		}
          F.setintArray(c);
          F.CountFrequency();
	}

}
