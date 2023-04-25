package org.tnsif.finalkeyword;

public class FinalExecutor {

	public static void main(String[] args) {
		FinalVariables f = new FinalVariables();
		f.display();
		
		FinalMethodChildClass f1 = new FinalMethodChildClass();
		f1.show(500);
		
		FinalClass f2 = new FinalClass();
		f2.show();
	}

}
