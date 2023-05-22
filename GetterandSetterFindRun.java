package org.Array;
import java.util.*;
class FindSameRun
{
	private int id;
	 private int run;
	  private String name;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getRun() {
		return run;
	}
	public void setRun(int run) {
		this.run = run;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	  
}

public class GetterandSetterFindRun {

	public static void main(String[] args) {
		int i,j;
		FindSameRun a[]=new FindSameRun[5];
		for(i=0;i<a.length;i++)
		{
			 a[i]=new FindSameRun();
	    	  Scanner xyz  = new Scanner(System.in);
	    	  System.out.println("Enter the name id and run of product");
	    	  String name=xyz.nextLine();
	    	  int id=xyz.nextInt();
	    	  int run=xyz.nextInt();
	    	  a[i].setName(name);
	    	  a[i].setId(id);
	    	  a[i].setRun(run);
		}
	    	  System.out.println("display without sorting");
	          for( i=0; i<a.length;i++) 
	          {
	       	   System.out.println(a[i].getId()+"\t"+a[i].getName()+"\t"+a[i].getRun());
	          }
	          for(i=0;i<a.length;i++)
	          {
	        	  for(j=i+1;j<a.length;j++)
	        	  {
	        		  int Rrun=a[i].getRun();
	        		  int Drun=a[j].getRun();
	        		  if(Rrun>Drun)
	        		  {
	        			  FindSameRun temp=a[i];
	        			  
	        			  a[i]=a[j];
	        			  a[j]=temp;
	        		  }
	        	  }
	          }
	          System.out.println("display sorting");
		       for( i=0; i<a.length;i++) {
		    	   System.out.println(a[i].getId()+"\t"+a[i].getName()+"\t"+a[i].getRun());
	         
			}
		
	}

	}

