package assignment3;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Q50Hashmap {
	public static void main(String[] args) {
		/*
		 * HashMap<String,String>
		 * input1={“mouse”:”100.2”,”speaker”:”500.6”,”Monitor”:”2000.23”}; String[]
		 * input2={“speaker”,”mouse”}; Float output=600.80(500.6+100.2);
		 * 
		 */

		HashMap<String, String> hm = new HashMap<String, String>();
		hm.put("mouse", "100.2");
		hm.put("spekar", "10.2");
		hm.put("monitor", "100.2");

		String[] n = new String[2];
		System.out.println("enter here");
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < n.length; i++) {

			n[i] = sc.next();
		}
		float ans=0;
		for(int i=0;i<n.length;i++) {
			String str1 = n[i];
			
			for(Map.Entry<String,String> hk:hm.entrySet()){
				String str2 =hk.getKey();
				if(str1.equalsIgnoreCase(str2)) {
					float f=Float.valueOf(hk.getValue());
					ans= ans+f;
				}
				
			}
		
		
		}System.out.println(ans);
		
		

	}
}
