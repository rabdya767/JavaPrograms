import java.lang.Integer;
import java.io.*;
public class typecnvrsn {
public static void main(String[] args) throws IOException {
    
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    System.out.println("Enter an Integer");
    String str=br.readLine();
    System.out.println(str);

    System.out.println("In Decimal "+Integer.parseInt(str));
    System.out.println("In Binary  "+Integer.toBinaryString(Integer.parseInt(str)));
    System.out.println("In HexDcml "+Integer.toHexString(Integer.parseInt(str)).toUpperCase());
    System.out.println("In Octal  "+Integer.toOctalString(Integer.parseInt(str)));
}    
}