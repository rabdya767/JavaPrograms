import java.lang.Integer;
public class lstonebit
{
    public static void main(String args[])
    {
        int A=31,B=7,C=10;
        System.out.println(Integer.lowestOneBit(A));
        System.out.println(Integer.lowestOneBit(B));
        System.out.println(Integer.lowestOneBit(C));
        /*Returns an int value with at most a single one-bit, 
        in the position of the lowest-order ("rightmost") one-bit 
        in the specified int value. Returns zero if the specified 
        value has no one-bits in its two's complement binary 
        representation, that is, if it is equal to zero
        */
    }
}