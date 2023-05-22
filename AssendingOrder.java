package org.Array;
import java.util.*;
class Assending
{ private int a[];
int i,j,temp;
 
public void setdata(int a[])
{
	this.a=a;
	
}

      void getdata()
      { 
    	  for(i=0;i<a.length;i++)
    	   {
    		 for(j=i+1;j<a.length;j++)
    		 {
    			 if(a[i]>a[j])
    			 {
    				 temp=a[i];
    				 a[i]=a[j];
    				 a[j]=temp;
    			 }
    		 }
    	   }
    	  for(i=0;i<a.length;i++)
      {
    	  System.out.printf("a[%d]---->%d\n",i,a[i]);
      }
      }

}

public class AssendingOrder {

	public static void main(String[] args) {
		Scanner xyz= new Scanner(System.in);
		Assending A=new Assending();
		int a[]=new int[5];
		System.out.println("enter the array  value");
		 for(int i=0;i<a.length;i++)
		 {
			 a[i]=xyz.nextInt();
		 }
		 A.setdata(a);
		 A.getdata();
            
	}

}
