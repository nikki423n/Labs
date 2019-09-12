import java.util.GregorianCalendar;
import java.util.Calendar;
public class GregorianCalenddar
{
    public static void main(String[] args)
    {
        GregorianCalendar cal = new GregorianCalendar(); // Today's date
        int dayOfMonth = cal.get(Calendar.DAY_OF_MONTH);
        int month = cal.get(Calendar.MONTH);
        int year = cal.get(Calendar.YEAR);
        int weekday = cal.get(Calendar.DAY_OF_WEEK); // 1 is Sunday, 2 is Monday,..., 7 is Saturday
        cal.add(Calendar.DAY_OF_MONTH, 100); // Now cal is one hundred days from today
        System.out.println("cal = " + cal.get(Calendar.MONTH) + "/" 
        + cal.get(Calendar.DAY_OF_MONTH) + "/" + cal.get(Calendar.YEAR));
        
        GregorianCalendar NikkisBday = new GregorianCalendar(2003, Calendar.APRIL, 2);
        System.out.println("NikkisBday=" + NikkisBday.get(Calendar.DAY_OF_WEEK));
        NikkisBday.add(Calendar.DAY_OF_MONTH, 10000); // Now nikkis bday is ten thousand days from today
        System.out.println("NikkisBday = " + NikkisBday.get(Calendar.MONTH) + "/" + NikkisBday.get(Calendar.DAY_OF_MONTH) + "/" + NikkisBday.get(Calendar.YEAR));
    }
}
