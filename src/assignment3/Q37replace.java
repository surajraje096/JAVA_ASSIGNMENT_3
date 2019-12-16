package assignment3;

import java.util.Scanner;

public class Q37replace {

	public static void main(String[] args) {

/*		 i/p1: new york
		    i/p2: new jersey
		    o/p: new y+r+

*/
		
		Scanner se = new Scanner (System.in);
		System.out.println("enter 1St string:=");
		String s=se.nextLine();
		System.out.println("enter 1St string:=");
		String s1=se.nextLine();
		
		
		
		
		
	//	String s = "new york";
		//String s1 = "new jersey";

		String n = "";

		for (int i = 0; i < s.length(); i++) {
			if (i % 2 == 0) {
				n = n + s.charAt(i);
			} else {
				if (s.charAt(i) == s1.charAt(i)) {
					n = n + s.charAt(i);
				} else {
					n = n + "+";
				}
			}
		}
		System.out.println(n);

	}
}
