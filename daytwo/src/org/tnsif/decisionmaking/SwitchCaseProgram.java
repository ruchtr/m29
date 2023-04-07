package org.tnsif.decisionmaking;
import java.util.Scanner;
public class SwitchCaseProgram {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number from 1-4 and you will se the song name: ");
		
		int variables = sc.nextInt();
		
		switch(variables)
		{
		case 1:
			System.out.println("Calm Down");
			break;
		case 2:
			System.out.println("Perfect");
			break;
		case 3:
			System.out.println("Dandellions");
			break;
		case 4:
			System.out.println("Taki Taki");
			break;
		default:
			System.out.println("Invalid Number");
		}

	}

}
