package assignment3;

import java.util.HashMap;
import java.util.Map;

public class Q50Hashmap {
public static void main(String[] args) {
	float no = 2601.22f;
	String n = String.valueOf(no);
	int l = 0 ;
	for(int i=0;i<n.length();i++)
	{
		if(n.charAt(i)=='.')
		{
			l = i;
		}
	}
	
	int key = l  - 0 ;
	int value = n.length() - (l+1);
	
	HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();
	hm.put(key, value);
	
	for(Map.Entry<Integer,Integer> me : hm.entrySet())
	{
		System.out.println(me.getKey()+"\t"+me.getValue());
	}
	
}
}
