package assignment3;

import java.util.Scanner;

public class Q36string {
	public static void main(String[] args) {
		/*
		 find the maximum chunk of a given string
		    i/p: this isssss soooo good
		    o/p=5
		    */
		
		Scanner se =new Scanner (System.in);
		System.out.println("enter string");
		String n= se.nextLine();
		
		
		//String n = "this issss sooooo good";
		int count=0,ans=0;
		
		for(int i=0;i<n.length()-1;i++)
		{
			if(n.charAt(i)==n.charAt(i+1))
			{
				count++;
			}
			else
			{
				count=0;
			}
			
			if(ans<count)
			{
				ans = count;
				//System.out.println(ans);
			}
		}System.out.println(ans+1);
		
	}

}
