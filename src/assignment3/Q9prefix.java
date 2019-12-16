package assignment3;

public class Q9prefix {

	public static void main(String[] args) {
		/*
		 * String[] input={"100","111","10100","10","1111"} input2="10" output=2;count
		 * strings having prefix"10" but "10" not included in count operation-- for how
		 * many strings input2 matches the prefix of each string in input1
		 * 
		 * String[] input={"01","01010","1000","10","011"} output=3; count the strings
		 * having prefix"10","01" but "10","01" not included
		 */

		String[] inputa = { "100", "111", "10100", "10", "1111" };

		String inputs = "10";

		String s = "";

		int count = 0;

		for (int i = 0; i < inputa.length; i++) {
			s = inputa[i];

			if ((s.charAt(0) == inputs.charAt(0)) && (s.charAt(1) == inputs.charAt(1)) && (s.length() > 2)) {
				count++;
			}

		}

		System.out.println("Count of the having prefix '10' is ------ >> " + count);

	}

}
