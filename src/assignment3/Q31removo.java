package assignment3;

public class Q31removo {

	public static void main(String[] args) {
		
		String s1 = "hello";
		String s2= "world";	
	
		String s3 = "";
		if(s1.length()==s2.length())
		{
			s3 = s1.concat(s2);
		}
		else if(s2.length()>s1.length())
		{
			String s4 = s2.substring(s1.length(),s2.length());
			s3 = s4.concat(s1);
		}else
		{
			String s4 = s1.substring(s2.length(),s1.length());
			s3 = s4.concat(s2);
		}System.out.println(s3);
		
	}
}
