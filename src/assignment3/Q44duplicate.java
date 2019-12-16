package assignment3;

import java.util.Scanner;

public class Q44duplicate {
	public static void main(String[] args) {
		 /*Find the Maximum span of the given array.
		    span is the number of elements between the duplicate element
		    including those 2 repeated numbers.
		    if the array as only one elemnt,then the span is 1.
			input[]={1,2,1,1,3}
			output1=4
			input[]={1,2,3,4,1,1,5}
			output1=6*/
		

		int[] n = new int[5];
		System.out.println("enter here");
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < n.length; i++) {

			n[i] = sc.nextInt();

		}

	//	int n[] = { 1, 2, 1, 1, 3 };

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
