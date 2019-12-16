
package assignment3;

import java.util.Scanner;

public class Q5SquareRoot {
	public static void main(String[] args) {
		/*
		 * Square root calculation of ((x1+x2)*(x1+x2))+((y1+y2)*(y1+y2)) o/p should be
		 * rounded of to int;
		 */

		Scanner se = new Scanner(System.in);
		System.out.println("Enter value 4intiger:=");
		int x1 = se.nextInt();
		int y1 = se.nextInt();
		int x2 = se.nextInt();
		int y2 = se.nextInt();

		// int x1 = 10; int y1 = 5; int x2 = 20; int y2 = 7;

		double no = (((x1 + y1) * (x1 + y1)) + ((x2 + y2) * (x2 + y2)));

		double d = Math.sqrt(no);

		System.out.println((d));

	}

}
