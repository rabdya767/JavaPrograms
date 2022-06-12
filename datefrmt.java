import java.time.*;
import java.time.temporal.*;
public class datefrmt {
    
    public static void main(String[] args) throws UnsupportedTemporalTypeException{

        LocalDate d=LocalDate.now();
        System.out.println(d.get(ChronoField.DAY_OF_WEEK));
        /**
        ZonedDateTime dt=ZonedDateTime.now();

        DateTimeFormatter df=DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss z Z");
        System.out.println(df.format(dt));
         */
    }
}
