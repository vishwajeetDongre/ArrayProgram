import java.util.*;
public class fibonacci {

	public static void main(String[] args) {
		Scanner S= new Scanner(System.in);
        System.out.println("enter the start and end");
        int start=S.nextInt();
        int end=S.nextInt();
        int f=start ,f1=1;
        int fib;
        
        for(int i=start;i<end;i++)
        {
        	fib=f1+f;
        	f=f1;
        	f1=fib;
        	System.out.println(fib);
        }
	}

}
