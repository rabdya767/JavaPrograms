import java.lang.Integer;
public class tostr1
{
    public static void main(String[] args) 
    {
        int A=234;
        int B=46;
        int C=10;
        //int type to string type 
        System.out.println(Integer.toString(A));
        System.out.println(Integer.toString(B));
        //int type to Hexstring type 
        System.out.println(Integer.toHexString(A).toUpperCase());
        System.out.println(Integer.toHexString(C).toUpperCase());
    }
}