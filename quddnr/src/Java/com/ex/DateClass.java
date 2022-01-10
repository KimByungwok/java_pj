package Java.com.ex;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;


public class DateClass {

	public static void main(String[] args) {
		Date date = Calendar.getInstance().getTime();
		//System.out.println(date);
		
		SimpleDateFormat formatter = new SimpleDateFormat();
		String formatedNow = formatter.format(date);
		System.out.println(formatedNow);

	}

}
