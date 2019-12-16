package assignment3;

import java.util.Scanner;

public class Q3string {

	public static void main(String[] args) {
		/*
		 * String[] input1=["Vikas","Lokesh",Ashok] expected output String:
		 * "Vikas,Lokesh,Ashok"
		 */

		String[] s = new String[3];
		System.out.println("enter here");
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < s.length; i++) {

			s[i] = sc.nextLine();

		}

		// String s[]={"Vikas","Lokesh","Ashok"};

		String n = "";
		for (int i = 0; i < s.length; i++) {
			String j = s[i];
			n = n + j + ",";
		}
		String nj = n.substring(0, n.length() - 1);
		System.out.println('"' + nj + '"');

	}
}
