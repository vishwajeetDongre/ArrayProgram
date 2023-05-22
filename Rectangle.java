package org.Array;
import java.util.*;
class Rectangle1
{ private int len,wid,area;
	void setLengthWidth(int len,int wid)//accept the radius 
 {
		this.len=len;
		this.wid=wid;
 }
 void showArea()
 { //write here calculation logics of circle area and display it
	 area=len*wid;
	 System.out.println("area if rectanglr"+area);
 }
}

public class Rectangle {
	public static void main(String x[])
	
	 { //create here object of scanner and accept the length and width as input 
		Scanner s=new Scanner(System.in);
		 //create the object of Rectangle and call setLengthWidth and pass radius input as parameter
		Rectangle1 R=new Rectangle1();
		System.out.println("enter the length and weight");
		int len=s.nextInt();
		int wid=s.nextInt();
		 //call showArea() for display the display the area
		R.setLengthWidth(len,wid);
		R.showArea();
		 }
		}


