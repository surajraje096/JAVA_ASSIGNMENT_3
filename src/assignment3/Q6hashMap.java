package assignment3;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Q6hashMap {

	public static void main(String[] args) {
		
		/* I/P hashmap<String String>{"ram:hari","cisco:barfi","honeywell:cs","cts:hari"};
		   i/p 2="hari";
		   o/p string[]={"ram","cts"};
		*/
		

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the map: ");
		int input = sc.nextInt();
		System.out.println("Enter " + input + " Key:value  pair this way(ram:hari cisco:barfi)");
		HashMap<String, String> hmap = new HashMap<String, String>();

		for (int i = 0; i < input; i++) {
			String str = sc.next();
			String key = str.split(":")[0];
			String value = str.split(":")[1];
			hmap.put(key, value);
		}

		System.out.println("Enter value to check: ");
		String strInput = sc.next();
		System.out.println("output:");
		for (Map.Entry<String, String> entry : hmap.entrySet()) {
			if (entry.getValue().equalsIgnoreCase(strInput)) {
				System.out.print(entry.getKey() + " ");
			}

		}

	}

}