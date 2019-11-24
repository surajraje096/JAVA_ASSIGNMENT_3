package assignment3;

public class Q45wordlenth {
	public static void main(String[] args) {
		String s = "california";

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
