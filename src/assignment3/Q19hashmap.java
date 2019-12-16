package assignment3;

import java.util.Scanner;

public class Q19hashmap {

	public static void main(String[] args) {

		/*
		 * input---input1=1; input2=4; input3=1; output1=4; operation--- print the
		 * element which is not repeated if all the inputs r different sum all inputs
		 * input---input1=1; input2=2; input3=3; output1=6;
		 */
		Scanner se = new Scanner(System.in);
		System.out.println("Enter 1st value= ");
		int n1 = se.nextInt();
		System.out.println("Enter 2nd value= ");
		int n2 = se.nextInt();
		System.out.println("Enter 3rd value= ");
		int n3 = se.nextInt();
		int ans = 0;
		// int n1=1,n2=1,n3=3,ans=0;
		if (n1 == n2) {
			ans = n3;
		} else if (n1 == n3) {
			ans = n2;
		} else if (n2 == n3) {
			ans = n1;
		} else {
			ans = n1 + n2 + n3;
		}
		System.out.println(ans);//final output

	}
}
