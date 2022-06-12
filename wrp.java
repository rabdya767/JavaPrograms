import java.lang.Integer;
public class wrp {
 public static void main(String[] args) {
     int i1=15;
     Integer i2=Integer.valueOf("123");
     Integer i3=Integer.valueOf("1010",2);
     Integer i4=Integer.decode("0xA7");
     Integer i5=Integer.reverseBytes(1);
     
     System.out.println(Integer.bitCount(7));
     System.out.println(Integer.reverse(1234));
     System.out.println(Integer.numberOfTrailingZeros(8));
     System.out.println(Integer.numberOfLeadingZeros(8));
     System.out.println(Integer.rotateLeft(8, 1));
     System.out.println(Integer.rotateRight(8, 1));
     System.out.println(Integer.reverseBytes(4096));
    
     System.out.println(Integer.highestOneBit(17));
     System.out.println(Integer.lowestOneBit(8));
     System.out.println(Float.NEGATIVE_INFINITY);
     
     System.out.println(i1);
     System.out.println(i2);
     System.out.println(i3);
     System.out.println(i4);
     System.out.println(i5);

 }    
}
