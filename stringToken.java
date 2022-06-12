import java.io.*;
import java.util.StringTokenizer;
public class stringToken {
    public static void main(String[] args)throws IOException {
    BufferedReader br=new BufferedReader(new InputStreamReader((System.in)));
        System.out.println("Enter the Emp details Separated by ,");
        System.out.println("ID,SAL,NAME");
        String str=br.readLine();
        StringTokenizer st=new StringTokenizer(str,",");
        System.out.println(st.countTokens());
        String s1=st.nextToken();
        String s2=st.nextToken();
        String s3=st.nextToken();
        System.out.println(st.hasMoreTokens());
        s1=s1.trim();
        s2=s2.trim();
        s3=s3.trim();
        int id=Integer.parseInt(s1);
        float sal=Float.parseFloat(s2);
        String name=s3;
        System.err.println("Name "+name);
        System.err.println("Id is"+id);
        System.err.println("Sal is"+sal);
    }   
}