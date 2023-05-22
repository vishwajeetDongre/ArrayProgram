import java.util.*;
public class factoreplusprime {

	public static void main(String[] args) {
		int f=1,i=1;;
		Scanner S= new Scanner(System.in);
		System.out.println("enter the number");
		int no=S.nextInt();
		ArrayList a=new ArrayList();
boolean b=true;
    for ( i=2;i<no;i++)
		{
			if(no%i==0)
			{
			   //a.add(i);	
				for(int j=2;j<i;j++)
				{
					if(i%j==0)
					{
						b=false;
						break;
						
					}
					
				}
				if(b==true)
				{
					//System.out.println(i);
				}
				
			System.out.println(i);
			}
			
			
			
		}

	}

}
