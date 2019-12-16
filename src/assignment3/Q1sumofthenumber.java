package assignment3;

import java.util.Scanner;

public class Q1sumofthenumber {
	public static void main(String[] args) {

		/*
		 * Find the sum of the numbers in the given input string array
		 * Input{“2AA”,”12”,”ABC”,”c1a”) Output:6 (2+1+2+1) Note in the above array 12
		 * must not considered as such i.e,it must be considered as 1,2
		 */

		String[] s = { "2AA", "12", "ABC", "c1a" };
		// ---------------------------------------
		int ans = 0;
		for (int i = 0; i < s.length; i++) {
			String n = s[i];
			for (int j = 0; j < n.length(); j++) {
				if (Character.isDigit(n.charAt(j))) {
					ans = ans + Character.getNumericValue(n.charAt(j));
				}
			}
		}
		System.out.println(ans);

	}

}
