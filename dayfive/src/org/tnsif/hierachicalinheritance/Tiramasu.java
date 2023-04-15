package org.tnsif.hierachicalinheritance;
public class Tiramasu extends Android {
	
	private int versionname;
	private String modelname ;
	public int getVersionname() {
		return versionname;
	}
	public void setVersionname(int versionname) {
		this.versionname = versionname;
	}
	public String getModelname() {
		return modelname;
	}
	public void setModelname(String modelname) {
		this.modelname = modelname;
	}
	public Tiramasu() {
		super();
		System.out.println(" child2 default constructor");
	}
	
	public Tiramasu(int versionname, String modelname) {
		super();
		this.versionname = versionname;
		this.modelname = modelname;
	}
	@Override
	public String toString() {
		return "Trramisu [versionname=" + versionname + ", modelname=" + modelname + ", getBrand()=" + getBrand()
				+ ", getOwnername()=" + getOwnername() + "]";
	}
	
	

}
