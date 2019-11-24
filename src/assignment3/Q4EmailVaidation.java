package assignment3;

public class Q4EmailVaidation {

	public static void main(String[] args) {
		
		String s = "test@gmail.com";	String dcom=".com";	int count=0;
		char c='@';				int avalue=0;	int aloc=0;	
		char c1 = '.';			int dvalue=0;   int dloc=0;
		
		for(int i=0;i<s.length();i++)
		{
			if(c==s.charAt(i))
			{
				count++;
				avalue++;
				aloc=i;
			}
		}
		//----------------------------------------
		if(count==1)
		{
			for(int i=0;i<s.length();i++)
			{
				if(c1==s.charAt(i))
				{
					count++;
					dvalue++;
					dloc=i;
				}
			}
		}
		//------------------------------------------
		if(count==2)
		{
			if(avalue==1 && dvalue==1)
			{
				count++;
			}
		}
		//--------------------------------------------------------
		if(count==3)
		{
			int temp=(dloc-aloc)-1;
			if(temp==5)
			{
				count++;
			}
		}
		//---------------------------------------------------------
		if(count==4)
		{
			if(aloc>=3)
			{
				count++;
			}
		}
		//---------------------------------------------------------------
		if(count==5)
		{
			if(s.endsWith(dcom))
			{
				count++;
			}
		}
		//---------------------------------------------------------------
		if(count==6)
		{
			System.out.println("Valid mail");
		}
		else
		{
			System.out.println("In-valid mail");
		}
	}

	}

