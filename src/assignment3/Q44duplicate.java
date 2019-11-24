package assignment3;

public class Q44duplicate {
	public static void main(String[] args) {

		int n[] = { 1, 2, 1, 1, 3 };

		int ans = 0;

		for (int i = 0; i < n.length - 1; i++) {
			int no = 0;
			for (int j = 0; j < n.length; j++) {
				if (n[i] == n[j]) {
					no = j - i;
				}
			}
			if (ans < no) {
				ans = no;
			}
		}
		System.out.println(ans + 1);

	}

}
