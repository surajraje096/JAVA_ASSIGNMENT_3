package assignment3;

import java.util.Scanner;

public class Q34concat {

	public static void main(String[] args) {
		/*
		 swap the every 2 chrecters in the given string 
		    If size is odd number then keep the last letter as it is.
		    Ex:- input: forget
			 output: ofgrte
		    Ex:- input  : NewYork
		         output : eNYwrok
		*/
	Scanner se = new Scanner (System.in);
	System.out.println("enter String:=   ");
	String s= se.next();
		

		//String s = "NewYork";

		String nj = "";
		if (s.length() % 2 == 0) {
			for (int i = 0; i < s.length(); i = i + 2) {
				char c1 = s.charAt(i);
				char c2 = s.charAt(i + 1);
				nj = nj + c2 + c1;
			}
		} else {
			char x = s.charAt(s.length() - 1);
			for (int i = 0; i < s.length() - 1; i = i + 2) {
				char c1 = s.charAt(i);
				char c2 = s.charAt(i + 1);
				nj = nj + c2 + c1;
			}
			nj = nj + x;
		}
		System.out.println(nj);

	}
}
