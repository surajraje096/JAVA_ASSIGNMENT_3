package assignment3;

import java.util.Scanner;

public class Q11duplicate {
	public static void main(String[] args) {
		
/*		input="hello"
			    output="hlo"; Alternative positions...
*/
		Scanner se= new Scanner (System.in);
		System.out.println("Enter String");
		String s= se.next();
		
		//String s = "hello";
		
				String n ="";
				for(int i=0;i<s.length();i=i+2)
				{
					n = n + s.charAt(i);
				}System.out.println(n);
	}

}
