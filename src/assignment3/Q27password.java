package assignment3;

public class Q27password {
	public static void main(String[] args) {
		
		String n = "surajraje096@gmail.com";				int count=0;
	
				if(n.length()>=8)
				{
					count++;
				}
					for(int i=0;i<n.length();i++)
				{
					if(n.charAt(i)=='@' || n.charAt(i)=='/' || n.charAt(i)=='_' || n.charAt(i)=='#')
					{
						count++;
						break;
					}
				}
			
				if((n.charAt(0)>='a' && n.charAt(0)<='z') || (n.charAt(0)>='A' && n.charAt(0)<='Z'))
				{
					count++;
				}
					if((n.charAt(n.length()-1)>='a' && n.charAt(n.length()-1)<='z') || (n.charAt(n.length()-1)>='A' && n.charAt(n.length()-1)<='Z') || (n.charAt(n.length()-1)>='0' && n.charAt(n.length()-1)<='9'))
				{
					count++;
				}
				
					
				for(int i=0;i<n.length();i++)
				{
					if(Character.isDigit(n.charAt(i)))
					{
						count++;
						break;
					}
				}
	
				for(int i=0;i<n.length();i++)
				{
					if((n.charAt(i)>='a' && n.charAt(i)<='z') || (n.charAt(i)>='A' && n.charAt(i)<='Z'))
					{
						count++;
						break;
					}
				}
				
	
				if(count==6)
				{
					System.out.println("Valid Password");
				}
				else
				{
					System.out.println("In-Valid Password");
				}
				
				
				
			}

		

	}


