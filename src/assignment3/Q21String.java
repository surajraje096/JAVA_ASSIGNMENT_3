package assignment3;

import java.util.Scanner;

public class Q21String {
	public static void main(String[] args) {
		/*
		 * input1-- Hello*world output-- boolean(true or false) operation-- if the
		 * character before and after * are same return true else false if there in no
		 * star in the string return false(Ignore case)
		 */
		
		  Scanner se = new Scanner(System.in);
		  System.out.println("Enter String with ' * ':= ");
		  String s = se.nextLine();
		 

	//	String s = "Hello*Hello";

		char c = '*';
		int a = 0;
		int count = 0;

		String s1 = "";
		String s2 = "";

		for (int i = 0; i < s.length(); i++) {

			char c1 = s.charAt(i);
			if (c == c1) {
				a = i;
			}

			s1 = s.substring(0, a);

			s2 = s.substring((a + 1), s.length() );

		}
		if (s1.equals(s2)) {
			System.out.println("True");
		}

		else {
			System.out.println("False");
		}

	}

}
