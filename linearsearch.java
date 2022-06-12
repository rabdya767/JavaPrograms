import java.io.*;
import java.lang.Integer;
public class linearsearch {
    public static void main(String[] args)throws IOException 
    {
        BufferedReader br=new BufferedReader(new InputStreamReader((System.in)));
        System.out.println("Enter No.Of Elemnts in the Array?");
        String str=br.readLine();
        int n=Integer.parseInt(str);
        
        int marks[]=new int[n];
        
        for(int i=0;i<n;i++)
            {
                System.out.println("Enter the array Element?");
                marks[i]=Integer.parseInt(br.readLine());
            }
        System.out.println("Enter The Searching Element?");
        int search=Integer.parseInt(br.readLine());
        
        boolean found=false;
        for(int i=0;i<n;i++)
        {
        if(search==marks[i])
        {
        System.out.printf("Element %d Found at Position %d%n",search,(i+1));
                found=true;
                break;
            }
            else
            continue;
        }
        if(!found)
        {
            System.err.println("Not Found");
        }
    }
}