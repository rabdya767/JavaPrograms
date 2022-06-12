import java.io.*;
public class array111 {
    public static void main(String[] args)throws IOException {
    BufferedReader br=new BufferedReader(new InputStreamReader((System.in)));
        System.out.println("Enter No.Of Elemnts in the Array?");
        int n=Integer.parseInt(br.readLine());
        int marks[]=new int[n];
        int tot=0;
        for(int i=0;i<n;i++)
        {
            System.out.println("Enter the array Elemnt?");
            marks[i]=Integer.parseInt(br.readLine());
            tot+=marks[i];
        }
        for(int j:marks)
        {
            System.out.println(j);
        }
        System.out.println("Total Marks are "+tot);
        //System.out.printf("Avg Marks are %.2f",(float)(tot)/n);
        System.out.println("Avg Marks are "+(float)(tot)/n);
    }   
   }