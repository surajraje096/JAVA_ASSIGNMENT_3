package assignment3;

import java.util.Scanner;

public class Q10escap {
	public static void main(String[] args) {
		
		
/*		 input1=1 ,input2=2 ,input3=3 --- output=6;
		    input1=1 ,input2=13,input3=3 --- output=1;
		    input1=13,input2=2 ,input3=8 --- output=8;
		    if value equal to 13,escape the value '13', as well as the next value to 13.
		    sum the remaining values
*/
		
		
		Scanner s = new Scanner(System.in);

		int[] a = new int[3];

		int sum = 0;
		System.out.println("Enter the values ");
		for (int i = 0; i < a.length; i++) {
			a[i] = s.nextInt();

		}

		for (int i = 0; i < a.length; i++) {
			if (a[i] == 13) {
				i = i + 2;

				if (i == 2 && (a.length == 3)) {
					sum = sum + a[i];
				}

				if (i >= a.length) {

					break;
				}

			}

			else {

				sum = sum + a[i];
			}

		}

		System.out.println(sum);

	}

}
