package assignment3;

import java.util.Scanner;

public class Q26ISBnumber {
	public static void main(String[] args) {

		/* prove whether a number is ISBN number or not
		    input="0201103311"
		    ISBN number:  sum=0*10 +2*9+ 0*8 +1*7+ 1*6 +0*5+ 3*4 +3*3+ 1*2 +1*1
		    sum%11==0 then it is ISBN number
		*/
		Scanner se = new Scanner (System.in);
		System.out.println("Enter String:=");
		String s= se.next();
		
		
		
		
		//String s = "0201103311";

		int no = Integer.parseInt(s);

		int n = 1, ans = 0;
		while (no != 0) {
			int x = no % 10;
			ans = ans + (x * n);
			n++;
			no = no / 10;
		}
		if (ans % 11 == 0) {
			System.out.println("ISBN Number");
		} else {
			System.out.println("Not ISBN Number");
		}
	}

}
