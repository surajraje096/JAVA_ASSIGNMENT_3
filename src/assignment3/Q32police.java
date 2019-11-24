package assignment3;

import java.util.TreeSet;

import javax.swing.text.html.HTMLDocument.Iterator;

public class Q32police {
	public static void main(String[] args) {
		
		String s = "a A 8 % &a &8 / %AAA %BBB";
		
		String s1[]=s.split(" ");
		int length=0;
		
		for(int i=0;i<s1.length;i++)
		{
			String s2=s1[i];
			if(length<s2.length())
			{
				length=s2.length();
			}
		}
		System.out.println(length);
		TreeSet<String> ts = new TreeSet<String>();
		for(int i=0;i<s1.length;i++)
		{
			String s4 = s1[i];
			if(length==s4.length())
			{
				ts.add(s4);
			}
		}
		for(String s5:ts)
		{
			System.out.println(s5);
			break;
		}
	}

}


