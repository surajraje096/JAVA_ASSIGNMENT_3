package assignment3;

import java.util.Scanner;

public class Q22remove {
	public static void main(String[] args) {
		/*
		 * input --String input1 ="xaXafxsd" output--String output1="aXafsdxx"
		 * operation-- remove the character "x"(only lower case) from string and place
		 * at the end
		 */

		Scanner se = new Scanner(System.in);
		System.out.println("Enter String");
		String s = se.next();

		// String s = "xaXafxsd";

		String n = "";
		int count = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == 'x') {
				count++;
			} else {
				n = n + s.charAt(i);
			}
		}

		for (int i = 0; i < count; i++) {
			n = n + 'x';
		}
		System.out.println(n);

	}

}
