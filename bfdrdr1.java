import java.io.*;
public class bfdrdr1
{
    public static void main(String args[]) throws IOException
    {
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        
        System.out.println("Enter a Byte ");
        byte b=Byte.parseByte(br.readLine());

        System.out.println("Enter a Short ");
        short s=Short.parseShort(br.readLine());

        System.out.println("Enter an Integer?");
        int i=Integer.parseInt(br.readLine());

        System.out.println("Enter a Long?");
        long l=Long.parseLong(br.readLine());

        System.out.println("Enter a Float ");
        float f=Float.parseFloat(br.readLine());

        System.out.println("Enter A Double ");
        double d=Double.parseDouble(br.readLine());

        System.out.println("Enter a Character?");
        char c=br.readLine().charAt(0);
        //char c=(char)br.read();

        System.out.println("Enter String?");
        String str=br.readLine();

        System.out.println("Byte    "+b);
        System.out.println("Integer "+i);
        System.out.println("Short   "+s);
        System.out.println("Long    "+l);
        System.out.println("Float   "+f);
        System.out.println("Double  "+d);
        System.out.println("Char    "+c);
        System.out.println("String  "+str);

    }
}