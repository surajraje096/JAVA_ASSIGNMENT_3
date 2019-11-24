package assignment3;

import java.util.LinkedHashSet;

public class Q41hashset {
	public static void main(String[] args) {

		String s = "this is sample test case";

		LinkedHashSet<Character> hs = new LinkedHashSet<Character>();
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			hs.add(c);
		}
		String nj = "";
		for (char n : hs) {
			nj = nj + n;
		}
		System.out.println(nj);

	}

}
