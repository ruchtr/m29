package org.tnsif.classobject;
import org.tnsif.encapsulation.HDFC;

public class EncapsulationDFemo {
	public static void main(String[] args) {
		HDFC h =new HDFC();
		//setter
		h.setCardno(451266542L);
		h.setCardtype("Credit");
		h.setCvvno(4444);
		h.setPinno(1001);
		//getter

		System.out.println(h.getCardno());
		System.out.println(h.getCardtype());
		System.out.println(h.getCvvno());
		System.out.println(h.getPinno());
		

	}

}
