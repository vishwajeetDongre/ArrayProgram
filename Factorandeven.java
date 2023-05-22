package org.Array;
import java.util.*;

public class Factorandeven {

	public static void main(String[] args) {
		Scanner S=new Scanner (System.in);
	 int i,f=1;
	 System.out.println("enter the number");
	 int no=S.nextInt();
	 for(i=1;i<=no;i++)
	 {
		 f=f*i;
		 
		 if(i%2==0)
		 {
			 System.out.println("even no is="+i);
		 }
		 else if(i%2==1)
		 {
			 System.out.println("odd no is ="+i);
		 }
		 
	   }
	 System.out.println("factor is="+f);
	 
	}

}
