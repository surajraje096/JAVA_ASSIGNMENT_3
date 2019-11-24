package assignment3;

public class Q3string {

	public static void main(String[] args) {
		
		String s[]={"Vikas","Lokesh","Ashok"};
		
				String n = "";
				for(int i=0;i<s.length;i++)
				{
					String j = s[i];
					n=n+j+",";
				}
				String nj = n.substring(0,n.length()-1);
				System.out.println(nj);
		
	}
}
