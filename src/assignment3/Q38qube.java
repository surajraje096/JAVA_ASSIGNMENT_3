package assignment3;

public class Q38qube {
	public static void main(String[] args) {
		int a[] = { 2, 4, 3, 5, 6 };

		double ans = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] % 2 == 0) {
				ans = ans + Math.pow(a[i], 2);
			} else {
				ans = ans + Math.pow(a[i], 3);
			}
		}
		System.out.println((int) ans);

	}

}
