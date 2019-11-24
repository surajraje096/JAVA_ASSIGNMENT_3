package assignment3;

public class Q33vowel {
	public static void main(String[] args) {

		String s = "AeiUUamlp";

		int a = 0, e = 0, i = 0, o = 0, u = 0;
		for (int j = 0; j < s.length(); j++) {
			char c = s.charAt(j);

			if ((c == 'a') || (c == 'A')) {
				a++;
			} else if ((c == 'e') || (c == 'E')) {
				e++;
			} else if ((c == 'i') || (c == 'I')) {
				i++;
			} else if ((c == 'o') || (c == 'O')) {
				o++;
			} else if ((c == 'u') || (c == 'U')) {
				u++;
			}
		}

		if ((a != 0) && (e != 0) && (i != 0) && (o != 0) && (u != 0)) {
			System.out.println("1");
		} else {
			System.out.println("2");
		}

	}

}
