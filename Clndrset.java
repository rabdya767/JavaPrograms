import java.util.Calendar;
public class Clndrset 
{

    public static void main(String[] args) 
    {
        
        Calendar c=Calendar.getInstance();
        c.set(Calendar.DATE,1);
        c.set(Calendar.MONTH,1);
        c.set(Calendar.YEAR,200);

        c.set(Calendar.HOUR,10);
        c.set(Calendar.MINUTE,14);
        c.set(Calendar.SECOND,56);
        c.set(Calendar.AM_PM,1);

        c.set(Calendar.DAY_OF_MONTH,12);
        c.set(Calendar.DAY_OF_WEEK,2);
        c.set(Calendar.DAY_OF_WEEK_IN_MONTH,1);
        c.set(Calendar.DAY_OF_YEAR,11);
        c.set(Calendar.DST_OFFSET,16);
        c.set(Calendar.HOUR_OF_DAY,11);
        c.set(Calendar.LONG_FORMAT,5);
        c.set(Calendar.WEEK_OF_YEAR,3);
        c.set(Calendar.WEEK_OF_MONTH,5);
        
        System.out.println(c);
    }
}
