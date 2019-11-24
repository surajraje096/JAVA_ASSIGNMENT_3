package assignment3;

public class Q16sequence {
	public static void main(String[] args) {
		
		int no[]={1,2,1,2,3,4,5,8};		
		String n = "123";String nj = "";
				for(int i=0;i<no.length;i++)
				{
					nj = nj + no[i];
				}
				if(nj.contains(n))
				{
					System.out.println("True");
				}
				else
				{
					System.out.println("False");
				}
				
	}

}
