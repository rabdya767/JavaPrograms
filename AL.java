import java.util.*;
import java.io.*;
import java.lang.Integer;

public class AL
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));    
        ArrayList<Integer>al=new ArrayList<Integer>();
        Collections.synchronizedList(al);
        System.out.println("Enter the No of elements of the ArrayList ");
        int n=Integer.parseInt(br.readLine());  
        for(int i=0;i<n;i++)
        {
            System.out.println("Enter the element");
            al.add(Integer.parseInt(br.readLine()));
        }
        /**
         * while(n>0)
         * {
         * System.out.println("Enter the element");
         * al.add(Integer.parseInt(br.readLine()));
         * n-=1;
         * }
         */
        System.out.println(al);
    }
}