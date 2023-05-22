import java.util.*;
public class fibinacciwhile {

	public static void main(String[] args) {
	 int fib,f=0,f1=1,i=1;;
	 Scanner S= new Scanner(System.in);
//	 System.out.println("enter the number");
//	 int no=S.nextInt();
//	 for(int i=1;i<no;i++)
//	 {
//		 fib=f+f1;
//		 f=f1;
//		 f1=fib;
//		 System.out.println(fib);
//	 }
	 while(i<34)
	 {
		 fib=f+f1;
		 f=f1;
		 f1=fib;
		 System.out.println(fib); 
		 i=fib;
	 }
     
	}

}
