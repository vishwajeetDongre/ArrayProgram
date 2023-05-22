import java.util.*;
public class primeno {

	public static void main(String[] args) {
		Scanner S= new Scanner(System.in);
		System.out.println("enter the start and end  of prime number");
		int start=S.nextInt();
		int end=S.nextInt();
		
		for(int i=start;i<end;i++)
		{   boolean b=true;
			for(int j=2;j<i;j++)
			{
			    if(i%j==0)
			   {
			    	 b=false;
				      
			   }
			}
			if(b)
			{
				System.out.println(i);
			}
			
		}

	}

}
