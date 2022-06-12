import java.io.*;
public class sorting {
    public static void main(String[] args)throws IOException {
    BufferedReader br=new BufferedReader(new InputStreamReader((System.in)));
        System.out.println("Enter No.Of Elemnts in the Array?");
        int n=Integer.parseInt(br.readLine());
        int marks[]=new int[n];
        for(int i=0;i<n;i++)
            {
                System.out.println("Enter the array Elemnt?");
                marks[i]=Integer.parseInt(br.readLine());
            }
        System.out.println("Before Sorting the Array is");
        for(int j:marks)
        {
            System.out.print(j+"\t");
        }
        System.out.printf("%n");
        System.out.println("After Sorting the Array is");
        for(int i=0;i<n;i++)
        {
            for(int j=i;j<n;j++)
            {
                if(marks[i]>marks[j])
                {
                    marks[i]=marks[i]^marks[j];
                    marks[j]=marks[i]^marks[j];
                    marks[i]=marks[i]^marks[j];
                }
            }
        }
        for(int j:marks)
        {
            System.out.print(j+"\t");
        }
    }
}