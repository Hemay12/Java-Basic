package DateTime;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

public class CurrentTime {

	public static void main(String[] args) {
		Date curr_date = new Date();
		System.out.println(curr_date);
		
		SimpleDateFormat formatDate  = new SimpleDateFormat("dd/MM/yyyy  HH:mm:ss z");
		formatDate.setTimeZone(TimeZone.getTimeZone("IST"));
		System.out.println(formatDate.format(curr_date));
		
		//Display Time in Different Country Format
		
		 Date d1 = new Date(); 
		 Locale locEngland = new Locale("en","cn");
		 DateFormat de = DateFormat.getDateInstance(DateFormat.FULL,locEngland);
		 System.out.println("England Format: "+ de.format(d1));	

	}
}
