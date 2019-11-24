package assignment3;

import java.util.HashMap;
import java.util.Map;

/*2) Create a program to get the hashmap from the given input string array where the key for the hashmap
is first three letters of array element in uppercase and the value of hashmap is the element itself
Input:{“goa”,”kerala”,”gujarat”}                 [string array]
Output:{{GOA,goa},{KER,kerala},{GUJ,Gujarat}}    [hashmap]*/
public class Q2Hashmap {

	
	public static void main(String[] args) {
		String[] n = {"goa","kerala","gujarat"};
		HashMap<String,String> hm= new HashMap<String,String>();
		
		for(int i=0;i<n.length;i++) {
			
			String key = "";
			String value = n[i];
			key = key+value.charAt(0)+value.charAt(1)+value.charAt(2);
			hm.put(key.toUpperCase(),value);
		}
		
		for(Map.Entry<String, String> me: hm.entrySet())
		{
			System.out.println(me.getKey()+"-->"+me.getValue());
		}
		
		
		
		
		
		
	}

}
