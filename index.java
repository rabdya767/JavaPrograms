public class index 
{
    public static void main(String[] args) 
    {
        String s1="UNIVERSITY";
        String s2="UNI";
        String s3="ITY";
        String s4="CITY";
        System.out.println(s1.indexOf(s2));
        System.out.println(s1.indexOf(s3));
        System.out.println(s1.lastIndexOf(s2));
        System.out.println(s1.lastIndexOf(s3));
        System.out.println(s1.indexOf(s4));
        System.out.println(s1.lastIndexOf(s4));
    }
}