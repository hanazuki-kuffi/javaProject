/** import java.text.SimpleDateFormat;
import java.util.Date;


public class DatesFormatter {
    public static void main(String[] args) {

        Date currentDate = new Date();
        SimpleDateFormat dayOfWeekFormat = new SimpleDateFormat("EEEE");
        String dayOfWeek = dayOfWeekFormat.format(currentDate);

        SimpleDateFormat dayOfMonthFormat = new SimpleDateFormat("MMM d");
        String dayOfMoth = dayOfMonthFormat.format(currentDate);

        SimpleDateFormat yearFormat = new SimpleDateFormat("yyyy");
        String dayOfYear = yearFormat.format(currentDate);

        System.out.println("Current Day of the Week: " + dayOfWeek);
        System.out.println("Current Day of the Month: " + dayOfMoth);
        System.out.println("Current Day of the Year: " + dayOfYear);

    }
 }
 */