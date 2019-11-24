package assignment3;

public class Q21String {
	public static void main(String[] args) {

		String s = "*Helloorld";

		char c = '*';
		int count = 0;
		try {

			for (int i = 0; i < s.length(); i++) {
				char c1 = s.charAt(i);
				if (c == c1) {
					char x = s.charAt(i - 1);
					char y = s.charAt(i + 1);
					count++;
					if (x == y) {
						System.out.println("True");
					} else {
						System.out.println("False");
					}
				}
			}
			if (count == 0) {
				System.out.println("False");
			}
		} catch (Throwable t) {
			System.out.println("False");
		}

	}

}
