package assignment3;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Q29hashmap {
	public static void main(String[] args) {
		/* In a hashmap if key is odd then find average of value as integer
		    ex: h1={1:4,2:6,4:7,5:9}
		        output=(4+9)/2
		*/
		
		int c = 0;
		int sum = 0;

		Map<Integer, Integer> hm = new HashMap<Integer, Integer>();

		hm.put(1, 4);
		hm.put(2, 6);
		hm.put(4, 7);
		hm.put(5, 9);

		hm.get(hm.keySet());
		hm.get(hm.values());

		Iterator<Integer> it = hm.keySet().iterator();

		while (it.hasNext()) {
			int b = it.next();

			if (b % 2 != 0) {
				c++;

				sum = sum + hm.get(b);
			}
		}

		//System.out.println(sum / c);

		//System.out.println(sum);
	System.out.println(c);
		
		
	}

}
