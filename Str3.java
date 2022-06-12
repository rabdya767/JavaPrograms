public class Str3 
{
    public static void main(String[] args) 
    {
        String s1="BOX";
        String s2="BOY";
        String s3="box";
        System.out.println(s1.compareTo(s2));
        System.out.println(s1.compareToIgnoreCase(s3));
        System.out.println(s1.equals(s2));
        System.out.println(s1.equalsIgnoreCase(s3));
    }
}