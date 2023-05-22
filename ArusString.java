package org.Array;
import java.util.*;
public class ArusString {

	public static void main(String[] args) {
		Scanner S= new Scanner(System.in);
		String s1="hello";
		String s2= new String("hello");
		if(s1==s2)
		{
			System.out.println("string are equal");
			
		}else
		{
			System.out.println(" "+System.identityHashCode(s1));
			System.out.println(" "+System.identityHashCode(s2));
			System.out.println("string are not equal");
		}
     if(s1.equals(s2))
     {
    	 System.out.println("string are equal");
     }else
     {
    	 System.out.println("string are not equal");
     }
		
	}

}
