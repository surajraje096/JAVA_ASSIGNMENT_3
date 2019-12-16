package assignment3;

import java.util.Scanner;

public class Q45wordlenth {
	public static void main(String[] args) {
/*		 Getting the first and last n letters from a word where wordlength > 2n.
		    Ex: Input: calrifonia,3.
		        output: calnia.
*/
		
		Scanner se= new Scanner (System.in);
		System.out.println("enter string:=");
		String s= se.next();
		
	//	String s = "california";

		int no = 3;
		String n = "";
		for (int i = 0; i < no; i++) {
			n = n + s.charAt(i);
		}
		for (int i = s.length() - no; i < s.length(); i++) {
			n = n + s.charAt(i);
		}
		System.out.println(n);

	}

}
