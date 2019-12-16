package assignment3;

import java.util.Scanner;

public class Q25String {
	public static void main(String[] args) {
		/*
		 * input string="hello", n=2 output: lolo
		 */

		Scanner se = new Scanner(System.in);
		System.out.println("Enter String:=");
		String s = se.next();

		// String s = "hello";

		String n = "";
		n = n + s.charAt(s.length() - 2) + s.charAt(s.length() - 1);
		int no = 2;
		for (int i = 1; i < no; i++) {
			n = n + n;
		}
		System.out.println(n);

	}

}
