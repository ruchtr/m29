package org.tnsif.threading;

public class Person {
	private int id;
	public String Name;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getSetName() {
		return Name;
	}
	public void setSetName(String setName) {
		Name = setName;
	}
	@Override
	public String toString() {
		return "Person [id=" + id + ", Name=" + Name + "]";
	}
	
	
}
