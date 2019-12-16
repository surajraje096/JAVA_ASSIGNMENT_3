package assignment3;

import java.util.Scanner;

public class Q14prefix {
	public static void main(String[] args) {
//		String array will be given.if a string is Prefix of an any other string in that array means count.

	
		String n[] = { "abcpq", "abc", "xyx", "abcyz" };
		int count = 0, ans = 0;

		for (int i = 0; i < n.length; i++) {
			String x = n[i];

			for (int j = 0; j < n.length; j++) {
				String y = n[j];

				if (x.startsWith(y)) {
					count++;
				}
			}

			if (count > 1) {
				ans++;
				count = 0;
			} else {
				count = 0;
			}
		}
		System.out.println("String prefix to any other string:" + ans);

	}

}
