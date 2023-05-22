import java.util.*;
public class reverseString {

	public static void main(String[] args) {
		String s="";
		Scanner S= new Scanner(System.in);
		System.out.println("enter the String");
		String name=S.nextLine();
		for(int i=name.length()-1;i>=0;i--)
		{
			s=s+name.charAt(i); 
		}
		System.out.print(s);
	}

}
