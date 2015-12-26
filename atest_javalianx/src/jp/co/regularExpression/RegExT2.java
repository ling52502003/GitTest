package jp.co.regularExpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExT2 {
	public static void main(String[] args) {
		Pattern pattern = Pattern.compile("b.g");
		Matcher matcher = pattern.matcher("sssbbgaaadddbkgddeeebbguu888byg");
		//IPµÿ÷∑∆•≈‰
		//(\d{1,3}\.){3}\d{1,3}
		System.out.println(matcher.matches()); 
		while (matcher.find()){
			System.out.println(matcher.group());
		}
		 

		String s =matcher.replaceAll("A");
		System.out.println(s); 
	}
}
