import java.util.*;
public class vipul {

	public static void main(String[] args) {
	Scanner S= new Scanner(System.in);
	System.out.println("enter the size of Array");
	int size=S.nextInt();
	int a[]=new int [size];
	for(int i=0;i<a.length;i++)
	{
		a[i]=S.nextInt();
	}
	System.out.println("enter the index ");
	 int index=S.nextInt();
	 for(int i=index;i<a.length-1;i++)
	 {
		 a[i]=a[i+1];
		 System.out.println("aa"+a[i]);
	 }
	 
	 System.out.println("after remove");
	 for(int i=0;i<a.length-1;i++)
	 {
		 System.out.println(a[i]);
	 }

	}

}
