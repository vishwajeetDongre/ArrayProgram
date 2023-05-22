package org.Array;
import java.util.*;
public class highestrepitativecharater {

	public static void main(String[] args) {
		int count=1;
		Scanner S= new Scanner(System.in);
		System.out.println("enter the String");
		String name=S.nextLine();
		char ch[]=name.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
			for(int j=(i+1);j<ch.length;j++)
			{
				if(ch[i]>ch[j])
				{
					char temp=ch[i];
					ch[i]=ch[j];
					ch[j]=temp;
				}
				
			}
		}
		int max=0;
		int index=0;
		for(int i=0;i<ch.length;i++)
		{
			for(int j=i+1;j<ch.length;j++)
			{
				if(ch[i]==ch[j])
				{
					count++;
				}else
				{  
					if(count>max)
					{
						max=count;
						index=i;
					}
				}
			}
		}
		System.out.println("the maximum repitative  element is  = "+ch[index]);

	}

}
