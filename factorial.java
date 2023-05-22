import java.util.*;
public class factorial {

	public static void main(String[] args) {
		Scanner S = new Scanner(System.in);
		System.out.println("enter the number");
		int no=S.nextInt();
		int f=1;
		for(int i=1;i<=no;i++)
		{
			f=f*i;
		}
		
      System.out.println(f);
	}

}
