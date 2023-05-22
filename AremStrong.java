import java.util.*;
public class AremStrong {

	public static void main(String[] args) {
		Scanner S= new Scanner(System.in);
		System.out.println("enter the number");
        int no=S.nextInt();
        int rem,sum=1,sum1=0;
        int count=0;
        int temp=no;
        while(no!=0)
        {  count++;
        	no=no/10;
        }
        no=temp;
        //System.out.println(no);
       for(int i=0;i<count;i++)
       {     sum=1;
    	   rem=no%10;
    	   for(int j=0;j<count;j++)
    	   {
    		  sum=sum*rem; 
    	   }
    	   sum1=sum1+sum;
    	   no=no/10;
       }
       System.out.println(sum1);
	}

}
