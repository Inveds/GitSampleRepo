import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SampleProgram1 {

	public static void main(String[] args) {
		
		try {
			int i = Integer.parseInt("10");
			Date d = new SimpleDateFormat("dd-MM-yyyy").parse("31-01-2021");
			System.out.println("Integer: " + i);
			System.out.println("Date: " + d.toString());
		} catch (ParseException e) {
			System.out.println("Incorrect date format.");
		} catch (NumberFormatException e) {
			System.out.println("Not a number");
		}
		
	}

}
