package assignment3;

public class Q26ISBnumber {
	public static void main(String[] args) {

		String s = "0201103311";

		int no = Integer.parseInt(s);

		int n = 1, ans = 0;
		while (no != 0) {
			int x = no % 10;
			ans = ans + (x * n);
			n++;
			no = no / 10;
		}
		if (ans % 11 == 0) {
			System.out.println("ISBN Number");
		} else {
			System.out.println("Not ISBN Number");
		}
	}

}
