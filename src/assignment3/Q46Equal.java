package assignment3;

import java.util.Scanner;

public class Q46Equal {
	public static void main(String[] args) {

		/*
		 * input1="aBrd"; input2="aqrbA"; input3=2; output1=boolean true; 2nd char of
		 * ip1 and last 2nd char of ip2 show be equal
		 */
		
		Scanner se= new Scanner(System.in);
		System.out.println("enter first string:=");
		String s1=se.nextLine();
		System.out.println("enter second string:=");
		String s2=se.nextLine();

		//String s1 = "aBrd";
		//String s2 = "aqrbA";

		int no = 2;
		char c1 = Character.toLowerCase(s1.charAt(no - 1));
		char c2 = Character.toLowerCase(s2.charAt(s2.length() - no));

		if (c1 == c2) {
			System.out.println("true");
		} else {
			System.out.println("False");
		}
	}

}
