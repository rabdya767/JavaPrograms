import java.io.*;
public class ByteWrp {
   @SuppressWarnings("deprecation")
 public static void main(String[] args) throws IOException {
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

    String Str="123";
    System.out.println("Enter A byte Number");
    byte b=Byte.parseByte(br.readLine());
    Byte byteobj=new Byte(b);
    Byte byteobj1=new Byte(Str);

    System.out.println(b);
    System.out.println(byteobj);
    System.out.println(byteobj1);
    //Byte Obj to String
    System.out.println(byteobj.toString());
    //String to Byte class Obj
    System.out.println(Byte.valueOf(Str));
    //byte to Byte class Obj
    System.out.println(Byte.valueOf(b));

    /**
     * //Byte Objects Comparision
     * if(byteobj==byteobj1)
     * {
     * System.out.println(byteobj+" and "+byteobj1+" are equal");
     * }
     * else
     * {
     * System.out.println(byteobj+" and "+byteobj1+" not equal so "+(byteobj==byteobj1));
     * }
     * 
     */

 }   
}