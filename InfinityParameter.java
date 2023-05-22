package org.Array;
import java.util.*;
class Infipara
{  private int square[],i,S;
	void setvalue(int ...x)// passing value
	{   
		 square=x;
	}
	 void calsquare()
	 {
		for( i=0;i<square.length;i++)
		{
	         S= square[i]*square[i];  //  calculating square
	         System.out.println("square is ="+S);
		}
		
	}
	
	
}

public class InfinityParameter {

	public static void main(String[] args) {
		Scanner s=new Scanner (System.in);
		Infipara P=new Infipara();
	    P.setvalue(10,20,30,40,50); // calling function
        P.calsquare();
	}

}
