import java.util.Date;


public class dt
{

    @SuppressWarnings("deprecation")
    public static void main(String args[])
    {

        Date d=new Date();

        int day=d.getDate();
        int year=d.getYear();
        int month=d.getMonth();

        int hr=d.getHours();
        int min=d.getMinutes();
        int sc=d.getSeconds();
        

        System.out.printf("%02d:%02d:%02d",hr,min,sc);
        if(hr<12)
        {
            System.out.printf(" AM");
        }
        else
        {
            System.out.printf(" PM");
        }

        System.out.printf("\n%02d-%02d-%4d",day,month,(year+1900));
    }
}