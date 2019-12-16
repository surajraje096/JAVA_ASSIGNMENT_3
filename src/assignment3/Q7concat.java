package assignment3;

public class Q7concat {

	public static void main(String[] args) {
		
/*		 Input1={“ABX”,”ac”,”acd”};
		   Input2=3;
		   Output1=X$d
*/
		
		
		String[] input1 = {"ABX","ac","acd"};

		
		//String[] input1 = { "ABX", "ac", "acd", "qcb", "io" };

		int input2 = 3;

		String s1 = new String();

		StringBuffer sb = new StringBuffer();

		for (int i = 0; i < input1.length; i++) {

			s1 = input1[i];

			if (s1.length() < (input2)) {
				char c = '$';

				sb.append(c);
			} else {

				char c = s1.charAt((input2 - 1));
				sb.append(c);
			}

		}

		System.out.println(sb);

	}
		
		
	}

