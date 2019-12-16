package assignment3;

import java.util.HashMap;
import java.util.Map;

public class Q51HashMap {
	public static void main(String[] args) {

		/*
		 * Input1=845.69, output=3:2; Input1=20.789; output=2:3; Input1=20.0;
		 * output=2:1; output is in Hashmap format. Hint: count the no of digits.
		 */

		float no = 2601.22f;
		String n = String.valueOf(no);
		int l = 0;
		for (int i = 0; i < n.length(); i++) {
			if (n.charAt(i) == '.') {
				l = i;
			}
		}

		int key = l - 0;
		int value = n.length() - (l + 1);

		HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
		hm.put(key, value);

		for (Map.Entry<Integer, Integer> me : hm.entrySet()) {
			System.out.println(me.getKey() + "\t" + me.getValue());
		}

	}
}
