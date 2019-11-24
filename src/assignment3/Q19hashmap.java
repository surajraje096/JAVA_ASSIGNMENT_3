package assignment3;

public class Q19hashmap {

	public static void main(String[] args) {
		int n1=1,n2=1,n3=3,ans=0;
		if(n1==n2)
		{
			ans = n3;
		}
		else if(n1==n3)
		{
			ans = n2;
		}
		else if(n2==n3)
		{
			ans = n1;
		}
		else
		{
			ans = n1+n2+n3;
		}System.out.println(ans);
		
	}
}
