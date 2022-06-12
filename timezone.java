import java.util.GregorianCalendar;
import java.util.TimeZone;

public class timezone {
 
    public static void main(String[] args) {
        GregorianCalendar gc=new GregorianCalendar();
       // gc.setTimeZone(TimeZone.getTimeZone("America/Los_Angeles"));
        TimeZone tz=gc.getTimeZone();
        //System.out.println(tz);
        System.out.println(tz.getDisplayName());//India Standard Time
        System.out.println(tz.getID());//Asia/Calcutta
        System.out.println(tz.toZoneId());
        String str[]=tz.getAvailableIDs();

        for(String x:str)
        System.out.println(x);
    }
}
