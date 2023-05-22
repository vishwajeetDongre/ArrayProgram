import java.util.*;
public class reverseString2 {

	public static void main(String[] args) {
		Scanner S= new Scanner(System.in);
 System.out.println("enter the string");
  String name= S.nextLine();
   int start=0;
   int mid=name.length()/2;
   int end=name.length()-1;
   String name1[]=name.split(" ");
   String s="";
   for(int i=0;i<name1.length;i++)

		   {
	          for(int j=name1[i].length()-1;j>=0;j--)
	          {
	        	  s=s+name1[i].charAt(j);
	        	  
	          }
	          s=s+" ";
		   }
   System.out.println(s);
	}

}
