package assignment3;

public class Q49perfectNumber {
	public static void main(String[] args) {
		int no = 6;

		int ans = 0;

		for (int i = 1; i < no; i++) {
			if (no % i == 0) {
				ans = ans + i;
			}
		}
		if (ans == no) {
			System.out.println("Perfect Number");
		} else {
			System.out.println("Not Perfect Number");
		}

	}

}
