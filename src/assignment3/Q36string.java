package assignment3;

public class Q36string {
	public static void main(String[] args) {
		String n = "this issss sssssoooooo good";
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
