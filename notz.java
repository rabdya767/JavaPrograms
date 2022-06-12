import java.lang.Integer;
import java.util.Arrays;
public class notz 
{
public static void main(String args[])
{
    int A=16,B=256,C=-100;
    int x[]={3,4,5,2,1,0};
    Arrays.sort(x);
    System.out.println(x[x.length-2]);
    
    System.out.println(Integer.numberOfTrailingZeros(A));
    System.out.println(Integer.numberOfTrailingZeros(B));
    System.out.println(Integer.numberOfTrailingZeros(C));
    /*
    ?Returns the number of zero bits following the 
    ?lowest-order ("rightmost") one-bit in the two's 
    ?complement binary representation of the specified 
    ?int value. Returns 32 if the specified value has 
    ?no one-bits in its two's complement representation, 
    ?in other words if it is equal to zero
    */
}    
}