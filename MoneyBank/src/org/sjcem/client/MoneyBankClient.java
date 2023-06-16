package org.sjcem.client;
import org.sjcem.application.MMBankFactory;
import org.sjcem.application.MMCurrentAcc;
import org.sjcem.application.MMSavingAcc;
import org.sjcem.framework.CurrentAcc;
import org.sjcem.framework.SavingAcc;
public class MoneyBankClient {
	public static void main(String[] args) {
		MMBankFactory b = new MMBankFactory();
		SavingAcc s = new MMSavingAcc(1111, "Ruchi Tare", 3000, true);
		CurrentAcc c = new MMCurrentAcc(2222, "Ruchi Tare", 5000, 4500);
		
		System.out.println(s);
		System.out.println(c);
		
		System.out.println();
		
		System.out.println("Saving Account");
		
		s.withdraw(200);
		
		
		System.out.println("\nCurrent Account");
		c.withdraw(400);
		
		
	}

}
