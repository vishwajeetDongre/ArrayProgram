package org.Array;
import java.util.*;
class Doctor
{
	int id,fees;
	String speciality,name;
	public int length;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getFees() {
		return fees;
	}
	public void setFees(int fees) {
		this.fees = fees;
	}
	public String getSpeciality() {
		return speciality;
	}
	public void setSpeciality(String speciality) {
		this.speciality = speciality;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
class Analysis
{ int i,j,max=0;
 Doctor d[];
	
	
	void setdetail(Doctor[] d)
	{
		this.d=d;
	}
	void Sortdetail()
	{
		
		for(i=0;i<d.length;i++)
		{  
			for(j=i+1;j<d.length;j++)
			{ 
				
				
				if(d[i].getFees()>d[j].getFees())
				{
					Doctor temp=d[i];
					d[i] =d[j];
					d[j]=temp;
				}
			}
			
		}
		System.out.println("Assending order of list\n");
		for(i=0;i<d.length;i++)
		{
			System.out.println(d[i].id+"\t"+d[i].name+"\t"+d[i].speciality+"\t"+d[i].fees+"\n");
		}
	}
		void  setdessending()
		{
			for(i=0;i<d.length;i++)
			{  
				for(j=i+1;j<d.length;j++)
				{ 
					
					
					if(d[i].getFees()<d[j].getFees())
					{
						Doctor temp=d[i];
						d[i] =d[j];
						d[j]=temp;
					}
				}
				
			}
			System.out.println("Dessending of order of list\n");
			for(i=0;i<d.length;i++)
			{
				System.out.println(d[i].id+"\t"+d[i].name+"\t"+d[i].speciality+"\t"+d[i].fees+"\n");
			}
			
			{
				for(i=0;i<d.length;i++)
				{
				if(d[i].getFees()>max)
				{
					max=d[i].getFees();
				}
				}
				System.out.println("miximum fees of doctor is="+max);
				//System.out.println(d[i].id+"\t"+d[i].name+"\t"+d[i].speciality+"\t"+max+"\n");
			}
			
		}
		
		
		
		}
		
	


public class Classmixfees {

	public static void main(String[] args) {
		int id,fees,i;
		String name,speciality;
		Scanner S=new Scanner(System.in);
		Doctor d[]=new Doctor[5];
		for(i=0;i<d.length;i++)
		{
			d[i]=new Doctor();
			System.out.println("enter the id name Specility fees");
			id=S.nextInt();
			name=S.next();
			speciality=S.next();
			fees=S.nextInt();
			
			d[i].setId(id);
			d[i].setName(name);
			d[i].setSpeciality(speciality);
			d[i].setFees(fees);
			
		}
		for(i=0;i<d.length;i++)
		{
			System.out.println(d[i].id+"\t"+d[i].name+"\t"+d[i].speciality+"\t"+d[i].fees+"\n");
		}
		Analysis a=new Analysis();
		a.setdetail(d);
		a.Sortdetail();
		a.setdessending();
		

	}

}
