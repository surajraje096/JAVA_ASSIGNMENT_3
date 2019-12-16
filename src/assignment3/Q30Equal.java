package assignment3;

import java.util.Scanner;

public class Q30Equal {

	public static void main(String[] args) {

		/*
		 * Return 1 if the last & first characters of a string are equal else return -1.
		 * Consider case. Eg: Input = "this was great" Output= 1
		 */
		Scanner se = new Scanner(System.in);
		System.out.println("Enter String:= ");
		String s = se.nextLine();

		// String s = "this was great";

		if (s.charAt(0) == s.charAt(s.length() - 1)) {
			System.out.println("1");
		} else {
			System.out.println("-1");
		}

	}
}
