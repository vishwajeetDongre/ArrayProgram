package org.Array;
import java.util.*;
class Product1
{
	private int id;
 private String Name;
 private int qty;
 private int  rate;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return Name;
}
public void setName(String name) {
	Name = name;
}
public int getQty() {
	return qty;
}
public void setQty(int qty) {
	this.qty = qty;
}
public int getRate() {
	return rate;
}
public void setRate(int rate) {
	this.rate = rate;
}


	
}

class CalculaterBill
{ Product1 x[];
	Product1 product1;
	
	void setproduct1(Product1 product1)
	{
		this.product1=product1;
	}
	


	int i;
	
void calBill(Product1 ...x)
{
	
}
void showdata()
{
	for( i=0;i<x.length;i++)
	{
		System.out.println(+product1.getId()+product1.getName()+product1.getQty()+product1.getRate());
	}
}
}

public class Product {

//	private static final Object[] Product1 = null;
//	private static Object Scanner;

	public static void main(String[] args) {
	int i,id=0 ,qty=0,rate=0,sum=0,total = 0;
		String name=null;
		int size;
		
		Product1 p[]=new Product1[3];
		Scanner S=new Scanner(System.in);
		
	
		for( i=0;i<p.length;i++)
		{
			p[i]=new Product1();
		
			
	      
	
		
		System.out.println("enter the product id");
	  id=S.nextInt();
		
		System.out.println("enter the product name");
		 name=S.next();
		
		System.out.println("enter the Quantity");
	      qty=S.nextInt();
		
		System.out.println("enter the rate");
		 rate=S.nextInt();
		 
		 
		    p[i].setId(id);
			p[i].setName(name);
			p[i].setQty(qty);
			p[i].setRate(rate);
		 }
//		 for(i=0;i<p.length;i++) {
//			 System.out.println(p[i].getId()+"\t"+p[i].getName()+"\t"+p[i].getQty()+"\t"+p[i].getRate()+"\n");
//		 }
		 
		for(i=0;i<p.length;i++)
		{
			total=p[i].getQty()*p[i].getRate();
			System.out.println(p[i].getId()+"\t\t"+p[i].getName()+"\t\t"+p[i].getQty()+"\t\t"+p[i].getRate()+"\t\t"+total+"\n");	
			sum=sum+total;
		}
		System.out.println("sum is = "+sum);
		

		
		
		//System.out.println(+sum);
		CalculaterBill c=new CalculaterBill();
		//c.setproduct1(p);
		c.calBill(p);
	
		
	}

}


