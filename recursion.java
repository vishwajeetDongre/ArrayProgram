import java.util.*;


	

public class recursion {
	static int fib,f=0,f1=1;
	
	
	static void show(int no)
	{ 
		if(no>0)
		{
			fib=f+f1;
			f=f1;
			f1=fib;
			System.out.println(fib);
			//no--;
			show(no-1);
		}
		
	}

	public static void main(String[] args) {
		Scanner S= new Scanner(System.in);
		System.out.println("enter the number");
		int no=S.nextInt();
		//fibo f=new fibo();
		System.out.println(f+"\n"+f1);
		show(no);
		
		
		
		
		
		
		
		
//		public class fibo{
//			static int f1=0,f2=1,fib,i=1;
//			
//			static void fibonacii(int n) {
//				
//				while(i<n)
//				{
//					fib=f1+f2;
//					f1=f2;
//					f2=fib;
//					System.out.println(+fib);
//					i++;
//				}
//				
//			public static void main(String x[]) {
//				
//				System.out.println("fibonacii is"+fibonacii(n-2));
//			
//				
//				}
			}
		
		
		
		
		
		
		

	}


