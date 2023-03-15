package March15regex;

import java.util.regex.Pattern;

public class regex1 {
	public static void main(String[] args) {
		boolean b1=Pattern.matches("[a-zA-z]", "b");
		boolean b2=Pattern.matches("[pqr]", "pqr");
		boolean b3=Pattern.matches("[^abc]", "p");
		System.out.println(b1+" "+b2+" "+b3);
	}}

