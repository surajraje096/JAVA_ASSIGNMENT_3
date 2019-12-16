package assignment3;

import java.util.Scanner;

public class Q31removo {

	public static void main(String[] args) {
		/*
		 * concat two string if length of two string is equal. if length of one string
		 * is greater, then remove the character from largest string and then add. The
		 * number of characters removed from largest string is equal to smallest
		 * string's length for example: input 1="hello"; input 2="helloworld";
		 * output="worldhello";
		 */
		Scanner se = new Scanner(System.in);
		System.out.println("Enter First String:=");
		String s1 = se.next();
		System.out.println("Enter second string:=");
		String s2 = se.next();

		// String s1 = "hello";
		// String s2= "world";

		String s3 = "";
		if (s1.length() == s2.length()) {
			s3 = s1.concat(s2);
		} else if (s2.length() > s1.length()) {
			String s4 = s2.substring(s1.length(), s2.length());
			s3 = s4.concat(s1);
		} else {
			String s4 = s1.substring(s2.length(), s1.length());
			s3 = s4.concat(s2);
		}
		System.out.println(s3);

	}
}
