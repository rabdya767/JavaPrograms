import java.lang.Integer;
public class artint 
{
    public static void main(String args[])
    {
    int A=10,B=8;
    //Integer C =new Integer(12);
    System.out.println(Integer.min(A,B));
    System.out.println(Integer.max(A,B));
    System.out.println(Integer.sum(A,B));
    System.out.println(Integer.hashCode(A));
    System.out.println(Integer.hashCode(A));
    System.out.println(Integer.compare(A,B));
    System.out.println(Integer.compareUnsigned(-15,10));
    System.out.println(Integer.reverse(A));
    }
}