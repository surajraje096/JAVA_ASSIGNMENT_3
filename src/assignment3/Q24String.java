package assignment3;

import java.util.Scanner;

public class Q24String {

	public static void main(String[] args) {
		
		/*String i/p1=2012;
	    sTRING i/p2=5
	    IF EXPERIENCE IS GREATER THAN INPUT 2 THEN TRUE;
		*/

		String s = "2012";			
		String s1 = "5";
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your Experience:");
		int n = sc.nextInt();
		int n1 = Integer.parseInt(s1);
		
		
		if(n1<n)
		{
			System.out.println("True");
		}
		else
		{
			System.out.println("False");
		}
	}

	}

