package assignment3;

public class Q35replace {

	public static void main(String[] args) {

		String s = "bengal";

		String n = "";
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (c == 'z') {
				n = n + 'a';
			} else {
				int no = (int) c;
				char nj = ((char) (no + 1));
				n = n + nj;
			}
		}
		System.out.println(n);

	}
}
