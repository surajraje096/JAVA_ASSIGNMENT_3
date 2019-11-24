package assignment3;

public class Q22remove {
	public static void main(String[] args) {
		String s = "xaXafxsd";

		String n = "";
		int count = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == 'x') {
				count++;
			} else {
				n = n + s.charAt(i);
			}
		}

		for (int i = 0; i < count; i++) {
			n = n + 'x';
		}
		System.out.println(n);

	}

}
