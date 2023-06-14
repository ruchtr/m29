//program to demonstrate on matches method of pattern class.
package org.tnsif.RegularExperssion;
import java.util.Scanner;
import java.util.regex.Pattern;
public class PatternClass {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the input String: ");
		String input = sc.nextLine();
		String pattern="Hey there , I am using Regular Expression";
		boolean result = Pattern.matches(pattern, input);
		System.out.println(result);
	}

}
