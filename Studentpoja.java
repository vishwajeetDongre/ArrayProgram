package org.Array;

import java.util.*;

class Student {
	private int id;
	String name;
	float per;
	int TotalFees;
	int disFees;
	int Achualpaidfee;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public int getTotalFees() {
		return TotalFees;
	}

	public void setTotalFees(int TotalFees) {
		this.TotalFees = TotalFees;
	}

	public float getPer() {
		return per;
	}

	public void setPer(float per) {
		this.per = per;
	}

	

	public int getdisFees() {
		return TotalFees;
	}

	public void setdisFees(int disFees) {
		this.disFees = disFees;
	}

	public int getAchualpaidfee() {
		return Achualpaidfee;
	}

	public void setAchualpaidfee(int Achualpaidfee) {
		this.Achualpaidfee = Achualpaidfee;
	}
}

class DiscountFees {
	Student student;

	void SetStudent(Student student) {
		this.student = student;
	}

	void checkDiscountEligibility(int Achualpaidfee) {
		int subtract=student.getTotalFees()-student.getAchualpaidfee();
		//System.out.println(subtract);
		int tfess=student.getTotalFees();
		//System.out.println(student.getTotalFees());
		float per=student.getAchualpaidfee()*100/tfess;
		//System.out.println(per);
		if (per >= 60) {
			student.disFees = student.TotalFees * 15 / 100;
			
			System.out.println("ID is=" + student.getId());
			System.out.println("NAME is =" + student.getName());
			System.out.println("Total fees is =" + student.getTotalFees());
			System.out.println("Acuchal paid fees is =" + student.getAchualpaidfee());
			System.out.println("Discount fees=" + student.disFees);
			System.out.printf("Total Fees are = %d", student.getTotalFees() - student.disFees);

		} else {
			System.out.println("ID is=" + student.getId());
			System.out.println("NAME is =" + student.getName());
			System.out.println("Total Fees are=" + student.getTotalFees());
			System.out.println("Acuchal paid fees is= " + student.getAchualpaidfee());
			System.out.println("remaning  fees=" + subtract);
			System.out.println("Total student percentage=" + per);
		}

	}
}

public class Studentpoja {

	public static void main(String[] args) {
//		int id;
//		String name;
//		float per;
//		int TotalFees;
//		int disFees;
//		
		Scanner s = new Scanner(System.in);
		Student s1 = new Student();
		DiscountFees D = new DiscountFees();

		System.out.println("enter the id ");
		int id = s.nextInt();
		System.out.println("enter the Name ");
		String name = s.next();
		System.out.println("enter the totalfees ");
	     int TotalFees = s.nextInt();
		// float per = s.nextFloat();
	     System.out.println("enter the Achual paid fees ");
		 int Achualpaidfee=s.nextInt();
		
		 
		 
		 s1.setId(id);
		s1.setName(name);
		s1.setTotalFees(TotalFees);
		//s1.setPer(per);
		s1.setAchualpaidfee(Achualpaidfee);
		//s1.setdisFees(disFees);
		

		D.SetStudent(s1);
		D.checkDiscountEligibility(Achualpaidfee);

	}

}
