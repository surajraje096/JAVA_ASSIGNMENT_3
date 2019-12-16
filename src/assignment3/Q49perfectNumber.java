package assignment3;

import java.util.Scanner;

public class Q49perfectNumber {
	public static void main(String[] args) {
		// perfect no or not?
		
		Scanner se =new Scanner (System.in);
		System.out.println("enter digit");
		int no =se.nextInt();
		
		//int no = 6;

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
