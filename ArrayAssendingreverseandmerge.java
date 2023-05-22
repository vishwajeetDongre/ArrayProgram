package org.Array;
import java.util.*;
public class ArrayAssendingreverseandmerge {

	public static void main(String[] args) {
		Scanner S= new Scanner(System.in);
		System.out.println("enter the size if first array");
		int size=S.nextInt();
        int a[]=new int[size];
        System.out.println("enter the size if second array");
		int size1=S.nextInt();
        int b[]=new int[size1];
        int c[]= new int[a.length+b.length];
        System.out.println("enter the first array value");
        for(int i=0;i<a.length;i++)
        {
        	a[i]=S.nextInt();
        }
        System.out.println("enter the second array value");
        for(int i=0;i<b.length;i++)
        {
        	b[i]=S.nextInt();
        }
        for(int i=0;i<a.length;i++)
        {
        	 for(int j=(i+1);j<a.length;j++)
        	 {
        		 if(a[i]>a[j])
        		 {
        			 int temp=a[i];
        			 a[i]=a[j];
        			 a[j]=temp;
        		 }
        	 }
        }
        System.out.println("sorting of first array");
        for(int i=0;i<a.length;i++)
        {
        	System.out.println(a[i]+"\t");
        }
        System.out.println("reverse of second array");
        int end=b.length-1;
        int mid=b.length/2;
        int start=0;
        for(start=0;start<mid;start++)
        {
        	int temp=b[start];
        	b[start]=b[end];
        	b[end]=temp;
        	end--;
        }
        for(int i=0;i<b.length;i++)
        {
        	System.out.println(b[i]+"\t");
        }
        
        int k=0;
        int v=0;
        for(int i=0;i<c.length;i++)
        {
        	if(i%2==0)
        	{
        		c[i]=a[v];
        		v++;
        		
        	}else 
        	{
        		c[i]=b[k];
            	k++;
            	
        	}
        	
        }
        System.out.println("Display the third Array Value");
        for(int i=0;i<c.length;i++)
        {
        	System.out.println(c[i]+"\t");
        }
        
	}

}
