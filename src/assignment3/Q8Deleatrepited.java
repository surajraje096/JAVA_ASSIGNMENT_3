package assignment3;

import java.util.LinkedHashSet;
import java.util.Scanner;

public class Q8Deleatrepited {

	public static void main(String[] args) {

		/*
		 * INPUT1= helloworld INPUT2= 2. delete the char,if rpted twice. if occurs more
		 * than twice,leave the first occurence and delete the duplicate O/P= helwrd;
		 */
		Scanner se = new Scanner(System.in);
		System.out.println("Enter String");
		String s = se.next();

		// String s = "helloworld";
		String s1 = "";
		int count = 0;

		LinkedHashSet<Character> hs = new LinkedHashSet<Character>();

		for (int i = 0; i < s.length(); i++) {
			for (int j = 0; j < s.length(); j++) {
				if (s.charAt(i) == s.charAt(j)) {
					count++;
				}
			}

			if (count == 2) {
				count = 0;
			} else {
				hs.add(s.charAt(i));
				count = 0;
			}
		}

		for (char c : hs) {
			s1 = s1 + c;
		}
		System.out.println(s1);
	}

}
