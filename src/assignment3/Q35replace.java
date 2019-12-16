package assignment3;

import java.util.Scanner;

public class Q35replace {

	public static void main(String[] args) {
		
/*		 i/p: bengal
		    o/p: ceogbl
		    if z is there replace with a

*/
		Scanner se = new Scanner (System.in);
		System.out.println("enter String:= ");
		String s= se.next();

	//	String s = "bengal";

		String ip = "bengzl";

		String op = " ";

		for (int i = 0; i < ip.length(); i++) {
			if (i % 2 == 0) {
				char c = ip.charAt(i);
				if (c == 'z') {
					c = 'a';
					op += c;
				} else {

					c++;
					op += c;
				}
			} else {
				char c = ip.charAt(i);
				op += c;
			}

		}

		System.out.println(op);
	}
}
