package assignment3;

public class Q25String {
	public static void main(String[] args) {
		String s = "hello";

		String n = "";
		n = n + s.charAt(s.length() - 2) + s.charAt(s.length() - 1);
		int no = 2;
		for (int i = 1; i < no; i++) {
			n = n + n;
		}
		System.out.println(n);

	}

}
