package assignment3;

import java.util.Scanner;

public class Q4EmailValidation {
	public static void main(String[] args) {

		/*
		 * Email Validation String input1="test@gmail.com" 1)@ & . should be present;
		 * 2)@ & . should not be repeated; 3)there should be five charcters between @
		 * and .; 4)there should be atleast 3 characters before @ ; 5)the end of mail id
		 * should be .com;
		 */

		Scanner se = new Scanner(System.in);
		System.out.println("Enter email:=");
		String s = se.next();

		// String s = "test@gmail.com";
		String com = ".com";
		int count = 0;
		char c = '@';
		char c1 = '.';
		int avalue = 0;
		int aloc = 0;
		int dvalue = 0;
		int dloc = 0;

		for (int i = 0; i < s.length(); i++) {
			if (c == s.charAt(i)) {
				count++;
				avalue++;
				aloc = i;
			}
		}
		// ----------------------------------------
		if (count == 1) {
			for (int i = 0; i < s.length(); i++) {
				if (c1 == s.charAt(i)) {
					count++;
					dvalue++;
					dloc = i;
				}
			}
		}
		// ------------------------------------------
		if (count == 2) {
			if (avalue == 1 && dvalue == 1) {
				count++;
			}
		}
		// --------------------------------------------------------
		if (count == 3) {
			int temp = (dloc - aloc) - 1;
			if (temp == 5) {
				count++;
			}
		}
		// ---------------------------------------------------------
		if (count == 4) {
			if (aloc >= 3) {
				count++;
			}
		}
		// ---------------------------------------------------------------
		if (count == 5) {
			if (s.endsWith(com)) {
				count++;
			}
		}
		// ---------------------------------------------------------------
		if (count == 6) {
			System.out.println("Valid mail");
		} else {
			System.out.println("In-valid mail");
		}

	}

}
