//program on single inheritance
//parents class
package org.tnsif.singleinheritance;

public class Citizen 
{
	//private data members
	private String name;
	private String adharNo;
	private String city;
	private long contactNo;
	
	//default constructor
	public Citizen() {
		super();
		// TODO Auto-generated constructor stub
	}

	//parameterised constructor
	public Citizen(String name, String adharNo, String city, long contactNo) {
		super();
		this.name = name;
		this.adharNo = adharNo;
		this.city = city;
		this.contactNo = contactNo;
	}
	
	//getters and setters

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAdharNo() {
		return adharNo;
	}

	public void setAdharNo(String adharNo) {
		this.adharNo = adharNo;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public long getContactNo() {
		return contactNo;
	}

	public void setContactNo(long contactNo) {
		this.contactNo = contactNo;
	}

	//when print object it calls to tostring method
	@Override
	public String toString() {
		return "Citizen [name=" + name + ", adharNo=" + adharNo + ", city=" + city + ", contactNo=" + contactNo + "]";
	}
	
	
	
	
	
	
}
