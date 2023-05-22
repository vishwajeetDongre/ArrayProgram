package org.Array;
import java.util.*;
class Circle1
{ 
	private  float radius,pi=3.14f,area;

public
	void setRadius(float radius)//accept the radius 
	 {
		this.radius=radius;
	 }
	void showArea()
	 { 
	   	area=pi*radius *radius;
	   	System.out.println("area of circle is ="+area);
	 }
	
}


public class Circle {

	public static void main(String[] args) {
	    Scanner s=new Scanner(System.in);
	    Circle1 C=new Circle1();
	    C.setRadius(5.0f);
	    C.showArea();
	    
	    

	}

}
