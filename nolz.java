import java.lang.Integer;
public class nolz 
{
public static void main(String args[])
{
    int A=16,B=256,C=-100;
    System.out.println(Integer.numberOfLeadingZeros(A));
    System.out.println(Integer.numberOfLeadingZeros(B));
    System.out.println(Integer.numberOfLeadingZeros(C));
    //floor(log2(x)) = 31 - numberOfLeadingZeros(x)
}    
}