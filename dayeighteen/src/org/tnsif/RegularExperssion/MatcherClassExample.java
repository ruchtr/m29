package org.tnsif.RegularExperssion;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatcherClassExample {

	public static void main(String[] args) {
		Pattern p = Pattern.compile("Job");
		Matcher m = p.matcher("Java Programming is enough"
				+ "to get an job");
		while(m.find())
		{
			System.out.printf("Pattern Found from "+m.start()+" "+(m.end()));
		}

	}

}
