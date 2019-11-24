package assignment3;

public class Q37replace {

	public static void main(String[] args) {

		String s = "new york";
		String s1 = "new jersey";

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
