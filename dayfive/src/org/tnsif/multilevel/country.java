package org.tnsif.multilevel;

public class country {
	private String countryname;
	private String countrycaptial;
	
	//getter and setter 
	public String getCountryname() {
		return countryname;
	}
	public void setCountryname(String countryname) {
		this.countryname = countryname;
	}
	public String getCountrycaptial() {
		return countrycaptial;
	}
	public void setCountrycaptial(String countrycaptial) {
		this.countrycaptial = countrycaptial;
	}
	@Override
	public String toString() {
		return "Country [countryname=" + countryname + ", countrycaptial=" + countrycaptial + "]";
	}
	

}