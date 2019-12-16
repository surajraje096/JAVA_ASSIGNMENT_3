package assignment3;

import java.util.Scanner;

public class Q39ovel {
	public static void main(String[] args) {
		/*
		 * input1="the sun raises in the east"; output1=raises; count no vowels in each
		 * word and print the word which has max no of vowels if two word has max no of
		 * vowel print the first one
		 */
		Scanner se = new Scanner(System.in);
		System.out.println("enter the string:=   ");
		String s = se.nextLine();
		// String s = "the sum raise in the east ";

		String n[] = s.split(" ");
		int no = 0;
		String k = "";

		for (int i = 0; i < n.length; i++) {
			String x = n[i];
			int count = 0;
			for (int j = 0; j < x.length(); j++) {
				char c = x.charAt(j);

				if ((c == 'a' || c == 'A') || (c == 'e' || c == 'E') || (c == 'i' || c == 'I') || (c == 'o' || c == 'O')
						|| (c == 'u' || c == 'U')) {
					count++;
				}
			}

			if (no < count) {
				no = count;
				k = x;
			}
		}
		System.out.println("Word :" + k + " Vowels :" + no);

	}

}
