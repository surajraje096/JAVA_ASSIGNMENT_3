package assignment3;

import java.util.Scanner;

public class Q18letter {
	public static void main(String[] args) {
/*		 
		    Input1=”so”;output1=”sososo”; 
		    HINT: if they give 3 letter word u have to display 2 time;

*/
		Scanner se =new Scanner (System.in);
		System.out.println("Enter String which has repeted 3 time:=");
		String s= se.next();

		//String s = "jn";		int count=0; 		
		String s1="";
		
		if(s.length()==2)
		{
			for(int i=1;i<=3;i++)
			{
				s1=s1+s;
			}
		}System.out.println(s1);
	}

}
