import java.lang.Integer;
public class diffforms {
    public static void main(String args[])
    {
        byte x=-5;
        int i=12;
        short s=345;
        System.out.println(Integer.toBinaryString(x));
        System.out.println(Integer.toBinaryString(i));
        System.out.println(Integer.toBinaryString(s));

        

        System.out.println(Integer.toHexString(x));
        System.out.println(Integer.toHexString(i));
        System.out.println(Integer.toHexString(s));
        
        

        System.out.println(Integer.toOctalString(x));
        System.out.println(Integer.toOctalString(i));
        System.out.println(Integer.toOctalString(s));
        
        
    }
}
