package assignment3;

import java.util.ArrayList;
import java.util.List;

public class Q20frute {

	public static void main(String[] args) {
/*		input1-List1-{apple,orange,grapes}
	    input2-List2-{melon,apple,mango}
	    output={mango,orange}
	    operation-- In 1st list remove strings starting with 'a' or 'g'
	                In 2nd list remove strings ending with 'n' or 'e'
	    Ignore case, return in string array
*/
		
		String[] input1 = { "apple", "orange", "grapes" };

		String input2[] = { "melon", "apple", "mango" };

		String s = "";

		String s1 = "";

		List<String> l = new ArrayList<String>();

		for (int i = 0; i < input1.length; i++) {
			char c = input1[i].charAt(0);

			if (c != 'a' && c != 'g' && c != 'A' && c != 'G') {
				s = input1[i];
				l.add(s);
			}

		}

		for (int i = 0; i < input2.length; i++) {
			char c = input2[i].charAt(input2[i].length() - 1);

			if (c != 'n' && c != 'e' && c != 'N' && c != 'E') {

				s1 = input2[i];
				l.add(s1);
			}

		}

		String output[] = new String[l.size()];

		for (int i = 0; i < output.length; i++) {
			output[i] = l.get(i);

			System.out.println(output[i]);
		}
		
		
	}
}
