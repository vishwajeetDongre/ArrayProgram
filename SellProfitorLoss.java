package org.Array;
import java.util.*;
class SellProfit
{
	private 
	int  sellprice,costprice;
	public void AccepetSellingCostprice(int sellprice,int costprice)
	{
		this.sellprice=sellprice;
		this.costprice=costprice;
	}
	void showProfitorloss()
	{
		if(sellprice>costprice)
		{  sellprice=sellprice-costprice;
		
			System.out.printf("profit is = %d",sellprice);
		}
		else if(sellprice<costprice)
		{  costprice=costprice-sellprice;
			
			System.out.println("Loss is="+costprice);
		}
		else if(sellprice==costprice)
		{
			System.out.println("NO LOSS NO PROFIT");
		}
	}
	
}

public class SellProfitorLoss {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		SellProfit p=new SellProfit();
		System.out.println("enter the cost price and selling price");
		int Costprice=s.nextInt();
		int sellprice=s.nextInt();
		p.AccepetSellingCostprice(sellprice,Costprice);
        p.showProfitorloss();
	}

}
