import java.util.*;
public class stringReverse {

	public static void main(String[] args) {
		Scanner S= new Scanner(System.in);
		System.out.println("enter the String");
		String name=S.nextLine();
		//int l= name.length();
		String s="";
	    for(int i=name.length()-1;i>=0;i--)
	    {
	    	s=s+name.charAt(i);
	    }
	    
	    System.out.println(s);
		if(name.equals(s))
		{
			System.out.println("string palimdrome");
		}else
		{
			System.out.println("String not palimdrome");
		}

	}

}
