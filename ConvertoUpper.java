package org.Array;
import java.util.*;
class ConvertoUppercase
{
	private char ch[];
	int i;
	public  void setdata(char ch[])
	{
		this.ch=ch;
	}
	void showdata()
	{ 
		for(i=0;i<ch.length;i++)
		{
		if(ch[i]>='a' && ch[i]<='z')
		{
			ch[i]=(char) ((int) ch[i]-32);
		}
		System.out.printf("%c",ch[i]);
		}
	}
}

public class ConvertoUpper {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String data;
		int i;
		//char ch[];
		ConvertoUppercase C=new ConvertoUppercase();
		
		//String ch[]=new String[10];
		System.out.println("ente the  charater");
        data=s.nextLine();
         char ch[]= data.toCharArray();
      C.setdata(ch) ;  
      C.showdata();
	}

}
