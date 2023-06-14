package org.tnsif.enumeration;

public enum Size implements Pizza {
	SMALL,MEDIUM,LARGE;

	@Override
	public void diaplaysize() {
		System.out.println("Size: "+this);
		
	}
}
