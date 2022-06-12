import java.util.Calendar;

public class Clndr
{
    public static void main(String args[])
    {
        Calendar c=Calendar.getInstance();
        
        
        int dt=c.get(Calendar.DATE);
        int mnth=c.get(Calendar.MONTH);
        int yr=c.get(Calendar.YEAR);

        int hr=c.get(Calendar.HOUR);
        int mn=c.get(Calendar.MINUTE);
        int sec=c.get(Calendar.SECOND);
        int am_pm=c.get(Calendar.AM_PM);
        /**
        int dom=c.get(Calendar.DAY_OF_MONTH);
        int dow=c.get(Calendar.DAY_OF_WEEK);
        int dowim=c.get(Calendar.DAY_OF_WEEK_IN_MONTH);
        int doy=c.get(Calendar.DAY_OF_YEAR);
        int dst=c.get(Calendar.DST_OFFSET);
        int hod=c.get(Calendar.HOUR_OF_DAY);
        int lg=c.get(Calendar.LONG_FORMAT);
        int woy=c.get(Calendar.WEEK_OF_YEAR);
        int wom=c.get(Calendar.WEEK_OF_MONTH);

        System.out.println("DAY_OF_MONTH "+dom);
        System.out.println("DAY_OF_WEEK "+dow);
        System.out.println("DAY_OF_WEEK_IN_MONTH "+dowim);
        System.out.println("DAY_OF_YEAR "+doy);
        System.out.println("DST_OFFSET "+dst);
        System.out.println("HOUR_OF_DAY "+hod);
        System.out.println("LONG_FORMAT "+lg);
        System.out.println("WEEK_OF_YEAR "+woy);
        System.out.println("WEEK_OF_MONTH "+wom);
        */

        System.out.println("*****TIME and DATE*****");
        System.out.printf("%02d:%02d:%02d ",hr,mn,sec);

        if(am_pm==0)
        {
            System.out.println("AM");
        }
        else
        {
            System.out.println("PM");
        }
        System.out.printf("%02d/%02d/%04d\n",dt,mnth,yr);

    }
}