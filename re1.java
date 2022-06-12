public class re1
{
    public static void main(String[] args) {
        String str="RABDYA SANTHOSH";
        String i="12345";
        String c="R";
        String space=" ";
        String nonSpace="@#$";
        System.out.println(str.matches(".*"));
        System.out.println(i.matches(".*"));
        System.out.println(c.matches(".*"));
        System.out.println(space.matches(".*"));
        System.out.println(nonSpace.matches(".*"));
    }
}