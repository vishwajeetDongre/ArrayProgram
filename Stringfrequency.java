package org.Array;
import java.util.*;

public class Stringfrequency {

	public static void main(String[] args) {
		int count=1;
		Scanner S= new Scanner(System.in);
		System.out.println("enter the Array");
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
	   for(int i=0;i<ch.length;i++)
	   {   
		   for(int  j=i+1;j<ch.length;j++)
		   {
			  if(ch[i]==ch[j])
				   {
					   count++;
					   i++;
				   }
				   else
				   {
					   System.out.println(ch[i]+"\t"+count);
					   count=1;
					   i++;
				   }
			   }
		   if(ch[i]!='\0')
		   {
			   System.out.println(ch[i]+"\t"+count);
		   }
		   }
		  
		   
	   }

	}


