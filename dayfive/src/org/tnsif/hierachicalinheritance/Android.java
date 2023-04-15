package org.tnsif.hierachicalinheritance;

//program on demo on hierachical onheritance 
//parent class

public class Android {
	
	private String brand;
	private String ownername ;
	
	//getter and setter
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getOwnername() {
		return ownername;
	}
	public void setOwnername(String ownername) {
		this.ownername = ownername;
	}
	
	public Android() {
		System.out.println("default constructor");
		brand ="Realme";
		ownername ="BingZhong";
		
	}
	public Android(String brand, String ownername) {
		super();
		this.brand = brand;
		this.ownername = ownername;
	}
	@Override
	public String toString() {
		return "Android [brand=" + brand + ", ownername=" + ownername + "]";
	}
	
	
	
	
	

}