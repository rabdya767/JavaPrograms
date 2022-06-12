import java.lang.reflect.Method;
public class case11 
{
    public static void main(String[] args) 
    {
        String s1="UNIVERSITY";
        String s2="rabdya santhosh";
        String sempty="";
        String sblnk=" ";

        System.out.println(s1.toLowerCase());
        System.out.println(s2.toUpperCase());

        String s=new String("There is a beatiful Girl");
        String str[]=s.split(" ");
        for(String i:str)
        {
        System.out.println(i);
        }
        System.out.println(str.length);
        System.out.println(sblnk.isBlank());
        //true if the string is empty or contains only white space codepoints, otherwise false
        System.out.println(sempty.isEmpty());
        //Returns true if, and only if, length() is 0
        System.out.println(s1.hashCode());
        //s[0]*31^(n-1) + s[1]*31^(n-2) + ... + s[n-1]
        System.out.println(sempty.hashCode());
        System.out.println(sblnk.hashCode());
        System.out.println(s1.strip());
        System.out.println(sblnk.strip());
        System.out.println(s2.codePointAt(2));
        System.out.println(s1.repeat(3));
        case11 obj=new case11();
        Class cls =obj.getClass();
        Method[] m= cls.getMethods();
        System.out.println(cls.getName());
        for(Method m1:m)
        {
            System.out.println(m1);
        }
    }
}