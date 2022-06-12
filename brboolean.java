import java.io.*;
public class brboolean
{
    public static void main(String[] args)throws IOException
    {
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter A boolean Value(T/F)");
        Boolean b=Boolean.parseBoolean(br.readLine());
        System.out.println("Boolean b is "+b);
    }
}