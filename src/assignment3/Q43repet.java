package assignment3;

public class Q43repet {
	public static void main(String[] args) {
		
		
	/*	Color Code Validation:
			String should starts with the Character '#'.
			Length of String is 7. 
			It should contain 6 Characters after '#' Symbol.
			It should contain Characters Between 'A-F' and Digits '0-9'.
			if String is acceptable then Output1=1
			else  Output1=-1; 
	*/
		String s = "#NAMja8";
		int count = 0;

		if (s.length() == 7) {
			count++;
		}

		if (count == 1) {
			if (s.charAt(0) == '#') {
				count++;
			}
		}

		for (int i = 1; i < s.length(); i++) {
			if (Character.isDigit(s.charAt(i))) {
				System.out.println("nm");
			} else {
				break;
			}
		}
		
		
		
		
	}

}
