import java.util.*;
public class midreverse {

	public static void main(String[] args) {
		 Scanner S= new Scanner(System.in);
		  System.out.println("enter the Array size");
		  int size=S.nextInt();
          int a[]=new int[size];
          int b[]=new int[size];
          System.out.println("enter the array value");
          for(int i=0;i<a.length;i++)
          {
        	  a[i]=S.nextInt();
          }
          
          int mid=a.length/2;
          int j=0;
          
          
         for(int i=mid-1;i>=0;i--)
         {
        	b[j]=a[i]; 
        	j++;
        	
         }
          b[j]=a[mid];
          j++;
         for(int i=a.length-1;i>mid;i--)
         {
        	 b[j]=a[i];
        	 j++;
         }
           
         for(int i=0;i<b.length;i++)
         {
        	 System.out.print(b[i]+"\t");
         }

	}

}
