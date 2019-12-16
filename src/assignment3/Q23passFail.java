package assignment3;

import java.util.HashMap;
import java.util.Map;

public class Q23passFail {
	public static void main(String[] args) {
		/*
		 * HashMap<String,Integer> h1={“abc”:50,”efg”:70}; if the mark is less than 60
		 * then put the output in the HashMap<String,String>
		 * h2={“abc”:”fail”,”efg”:”pass”}
		 */

		Map<String, Integer> h1 = new HashMap<String, Integer>();

		h1.put("abc", 50);
		h1.put("efg", 70);
		h1.put("pqr", 60);
		h1.put("egd", 80);
		h1.put("msk", 90);
		h1.put("etc", 30);

		Map<String, String> h2 = new HashMap<String, String>();

		for (Map.Entry<String, Integer> esi : h1.entrySet()) {

			if (esi.getValue() < 60) {
				String s = "Fail";
				h2.put(esi.getKey(), s);

			} else {
				String s = "Pass";
				h2.put(esi.getKey(), s);
			}
		}

		System.out.println(h2);

	}

}
