import java.util.*;
public class fibonacii {

	public static void main(String[] args) {
		Scanner S= new Scanner(System.in);
		int fib,f=0,f1=1;
		for(int i=1;i<=8;i++)
		{
			fib=f+f1;
			f=f1;
			f1=fib;
			System.out.println(fib);
		}

	}

}
