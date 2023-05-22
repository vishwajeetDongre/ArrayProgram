package org.Array;
import java.util.*;
// program of enter the three array anf find common element
public class enterthreeArrayfindcommonelement {

	public static void main(String[] args) {

        int[] array1 = {2, 3, 4, 7, 9};
        int[] array2 = {1, 2, 4, 5, 10};
        int[] array3 = {3, 4, 5, 6, 11};

        //Find common element in three integer array
        System.out.println("Common elements from three integer arrays: ");
        for(int i = 0; i < array1.length; i++)
        {
            for(int j = 0; j < array2.length; j++)
            {
                for(int k = 0; k < array3.length; k++)
                {
                    if(array1[i] == array2[j] && array2[j] == array3[k])
                    {
                        System.out.println(array1[i]);
                    }
                }
            }
        }
    }

 
  
     
	}


