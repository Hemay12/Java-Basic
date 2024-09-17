package DateTime;

import java.util.Date;
import java.text.SimpleDateFormat;

public class DateTime1 {

	public static void main(String[] args) {
		Date date = new Date();
		
		System.out.println(date);
		SimpleDateFormat formatTime  = new SimpleDateFormat("hh.mm aa");
		// hh = hours in 12hr format
        // mm = minutes
        // aa = am/pm
		//System.out.println(time);
		
		String time = formatTime.format(date);
	     System.out.println("Current Time in AM/PM Format is : " + time);
		

	}

}
