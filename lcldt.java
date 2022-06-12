import java.time.LocalDate;

public class lcldt {

    public static void main(String[] args) {

        LocalDate d=LocalDate.now();
    //  System.out.println(d.plusDays(20));

        System.out.println(d.getDayOfMonth());
        System.out.println(d.getDayOfYear());
        System.out.println(d.ofEpochDay(10000));
        System.out.println(d.lengthOfMonth());
        System.out.println(d.getYear());
        System.out.println(d.getMonthValue());
        System.out.println(d.MAX.toString());
        System.out.println(d.parse("2000-02-06"));
        System.out.println(d.ofEpochDay(10000));
    }
}
