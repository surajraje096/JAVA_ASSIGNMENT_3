package assignment3;

import java.time.Year;
import java.util.Calendar;

public class Q48leapYear {
	public static void main(String[] args) {

		// leap year or not using API?

		Calendar d = Calendar.getInstance();
		int year = d.get(Calendar.YEAR);

		Year y = Year.of(year);

		if (y.isLeap()) {
			System.out.println("True");
		} else {
			System.out.println("False");
		}

	}

}
