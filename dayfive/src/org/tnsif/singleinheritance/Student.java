//student class
//every inheritance is  IS-A relationship
package org.tnsif.singleinheritance;

public class Student extends Citizen{
	 
	private String college;
	private int rollno;
	
	//default constructor
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	//parameterised constructor
	public Student(String name, String adharNo, String city, long contactNo, String college, int rollno) {
		super(name, adharNo, city, contactNo);
		this.college = college;
		this.rollno = rollno;
	}
	public String getCollege() {
		return college;
	}
	public void setCollege(String college) {
		this.college = college;
	}
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	@Override
	public String toString() {
		return "Student [college=" + college + ", rollno=" + rollno + ", getCollege()=" + getCollege()
				+ ", getRollno()=" + getRollno() + ", getName()=" + getName() + ", getAdharNo()=" + getAdharNo()
				+ ", getCity()=" + getCity() + ", getContactNo()=" + getContactNo() + "]";
	}
	
	
	
	
	
	
	
	
	
	}

	
	

	
	
