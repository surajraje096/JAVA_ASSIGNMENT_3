package assignment3;

public class Qpancard {

	public static void main(String[] args) {
		
		String s = "ABC3843N";
		int count=0;
		if(s.length()==8)
		{

			for(int i=0;i<3;i++)
			{
				if(s.charAt(i)>='A' && s.charAt(i)<='Z')
				{
					count++;
				}
			}
			if(count==3)
			{
				for(int i=3;i<s.length()-1;i++)
				{
					if(Character.isDigit(s.charAt(i)))
					{
						count++;
					}
				}
			}
			
			if(count==7)
			{
				char c = s.charAt(s.length()-1);
				if(c>='A' && c<='Z')
				{
					count++;
				}
			}
			
			if(count==8)
			{
				System.out.println("Valid PAN number");
			}
			else
			{
				System.out.println("PAN number is not valid");
			}
		}
		else
		{
			System.out.println("PAN number is not valid");
		}
	}



	}

