package assignment3;

public class Q43colour {
	public static void main(String[] args) {

		String s = "#NAMja8";
		int count = 0;

		if (s.length() == 7) {
			count++;
		}

		if (count == 1) {
			if (s.charAt(0) == '#') {
				count++;
			}
		}

		for (int i = 1; i < s.length(); i++) {
			if (Character.isDigit(s.charAt(i))) {
				System.out.println("nm");
			} else {
				break;
			}
		}

	}
}
