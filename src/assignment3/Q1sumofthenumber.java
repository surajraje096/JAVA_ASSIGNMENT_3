package assignment3;

public class Q1sumofthenumber {
	public static void main(String[] args) {
		
		
		String[] s = {"2AA","1","2","ABC","c1a"};

		int ans = 0 ;
		for(int i=0;i<s.length;i++)
		{
			String n = s[i];
			for(int j=0;j<n.length();j++)
			{
				if(Character.isDigit(n.charAt(j)))
				{
					ans = ans + Character.getNumericValue(n.charAt(j));
				}
			}
		}System.out.println(ans);
		
		
		
		
	}

}
