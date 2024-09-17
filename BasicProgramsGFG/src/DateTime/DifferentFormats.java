package DateTime;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.io.*;

public class DifferentFormats {

	public static void main(String[] args) {
		LocalDate ld = LocalDate.now();
		System.out.println(ld);
		
		DateTimeFormatter myDateFormat = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		String str = ld.format(myDateFormat);
		System.out.println(str);
		
		DateTimeFormatter myDateFormat1  = DateTimeFormatter.ofPattern("EEEE,  dd MMM yyyy");
		String str1 = ld.format(myDateFormat1);
		System.out.println(str1);

	}

}
