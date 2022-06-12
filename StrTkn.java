import java.io.*;
import java.util.StringTokenizer;


public class StrTkn
{
    public static void main(String[] args)  throws IOException
    {
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Entet Input Separated by ,");
        String str=br.readLine();
        
        StringTokenizer st=new StringTokenizer(str,",");
        
        System.out.println("Tokens Are");
        
        

        while(st.hasMoreTokens())
        {
            String one=st.nextToken();
            System.out.println(one);
        }

    }
}