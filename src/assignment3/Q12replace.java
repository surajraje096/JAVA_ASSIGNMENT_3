package assignment3;

import java.util.Scanner;

public class Q12replace {
	public static void main(String[] args) {

//		Input1=�Hello World�;  output-------�  �dello WorlH�.

		Scanner se = new Scanner(System.in);
		System.out.println("Enter String");
		String s = se.nextLine();

		// String s = "Hello World";
		char c1 = s.charAt(0);
		char c2 = s.charAt(s.length() - 1);

		String n[] = s.split(" ");
		String n1 = n[0];
		String n2 = n1.replace(n1.charAt(0), c2);

		String n3 = n[1];
		String n4 = " " + n3.replace(n3.charAt(n3.length() - 1), c1);

		System.out.println(n2.concat(n4));

	}

}
