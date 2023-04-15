package org.tnsif.hierachicalinheritance;

public class SnowCone extends Android  {
	
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
	public SnowCone() {
		System.out.println(" child 1 default constructor");
		
	}
	
	public SnowCone(int versionname, String modelname) {
		super();
		this.versionname = versionname;
		this.modelname = modelname;
	}
	@Override
	public String toString() {
		return "SnowCone [versionname=" + versionname + ", modelname=" + modelname + ", getBrand()=" + getBrand()
				+ ", getOwnername()=" + getOwnername() + "]";
	}
	
	

}

