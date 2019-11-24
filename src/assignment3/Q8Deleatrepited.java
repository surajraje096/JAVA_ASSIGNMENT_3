package assignment3;

import java.util.LinkedHashSet;

public class Q8Deleatrepited {

	public static void main(String[] args) {

		String s = "helloworld";
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
