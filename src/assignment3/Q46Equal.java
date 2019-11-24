package assignment3;

public class Q46Equal {
	public static void main(String[] args) {
		String s1 = "aBrd";
		String s2 = "aqrbA";

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
