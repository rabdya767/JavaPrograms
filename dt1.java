import java.util.Date;

public class dt1 {
    
    @SuppressWarnings("deprecated")
    public static void main(String[] args) {
        @SuppressWarnings("deprecated")
        Date d=new Date();
        @SuppressWarnings("{deprecated}")
        Date d1=new Date("01/05/2000");

        System.out.println(d.before(d1));
         /*
        System.out.println(d.getDay());
        System.out.println(d.getDay());
        System.out.println(d.getHours());
        System.out.println(d.getMinutes());
        System.out.println(d.getYear()+1900);
        System.out.println(d.getTime());
        System.out.println(d.toInstant());

       // System.out.println(d.getTime()/1000/60/60/24/365);//years
       /*
       System.out.println(d.getDate());
       System.out.println(d.getMonth()+1);
       System.out.println(d.getYear()+1900);
       */
    }
}
