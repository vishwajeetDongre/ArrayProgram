import java.util.*;
public class aword {

	public static void main(String[] args) {
		Scanner S= new Scanner(System.in);
		System.out.println("enter the String");
		String name= S.nextLine();
		 String name1[]=name.split(" ");
		 String s=" ";
         for(int i=0;i<name1.length;i++)
         {
        	 for(int j=0;j<name1[i].length()-1;j++)
        	 {   
        		 char ch[]=name1[i].toCharArray();
        		 if('a'==ch[j])
        		 {
        			System.out.println(name1[i]); 
        		 }
        	 }
         }
	}

}
