package assignment3;

import java.util.Scanner;

public class Q27password {
	public static void main(String[] args) {
		/*
		 * Validate Password validation based on following criteria: -> minimum length
		 * is 8 -> should contain any of these @/_/# -> should not start with
		 * number/special chars(@/#/_) -> should not end with special chars -> can
		 * contain numbers,letters,special chars
		 */

		Scanner se = new Scanner(System.in);
		System.out.println("Enter password:=");
		String n = se.next();

		int count = 0;
//check lenght
		if (n.length() >= 8) {
			count++;
		}

// special character		
		for (int i = 0; i < n.length(); i++) {
			if (n.charAt(i) == '@' || n.charAt(i) == '/' || n.charAt(i) == '_' || n.charAt(i) == '#') {
				count++;
				break;
			}
		}
//Start with upper or low case
		if ((n.charAt(0) >= 'a' && n.charAt(0) <= 'z') || (n.charAt(0) >= 'A' && n.charAt(0) <= 'Z')) {
			count++;
		}

//if want smole case character upper character digit 		
		if ((n.charAt(n.length() - 1) >= 'a' && n.charAt(n.length() - 1) <= 'z')
				|| (n.charAt(n.length() - 1) >= 'A' && n.charAt(n.length() - 1) <= 'Z')
				|| (n.charAt(n.length() - 1) >= '0' && n.charAt(n.length() - 1) <= '9')) {
			count++;
		}
// digit availabale is 
		for (int i = 0; i < n.length(); i++) {
			if (Character.isDigit(n.charAt(i))) {
				count++;
				break;
			}
		}
//lower and upper character
		for (int i = 0; i < n.length(); i++) {
			if ((n.charAt(i) >= 'a' && n.charAt(i) <= 'z') || (n.charAt(i) >= 'A' && n.charAt(i) <= 'Z')) {
				count++;
				break;
			}
		}
//valid final outpute
		if (count == 6) {
			System.out.println("Valid Password");
		} else {
			System.out.println("In-Valid Password");
		}

	}

}
