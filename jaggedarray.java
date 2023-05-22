import java.util.*;
public class jaggedarray {

	public static void main(String[] args) {
      Scanner S= new Scanner(System.in);		
    System.out.println("enter the row you want");
    int row=S.nextInt();
    System.out.println("enter the column");
    int a[][]=new int[row][];
    for(int i=0;i<row;i++)
    {
    	 a[][]=new int[row][i];
    }
   
    for(int i=0;i<row;i++)
	{
		for(int k=0;k<i;k++)
		{
			System.out.println(a[i][k]);
		}
	}
}
}
