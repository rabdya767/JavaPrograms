import java.io.*;
import java.lang.Integer;
public class binsearch {
    public static void main(String[] args)throws IOException 
    {
        BufferedReader br=new BufferedReader(new InputStreamReader((System.in)));
        System.out.print("Enter No.Of Elemnts in the Array? ");
        String str=br.readLine();
        int n=Integer.parseInt(str);
        
        int marks[]=new int[n];
        
        for(int i=0;i<n;i++)
            {
                System.out.print("Enter the array["+(i+1)+"] Element? ");
                marks[i]=Integer.parseInt(br.readLine());
            }
        System.out.println("Enter The Searching Element?");
        int search=Integer.parseInt(br.readLine());
        java.util.Arrays.sort(marks);
        int low=0,high=n-1,middle=(low+high)/2;
        bin_search(marks,low,high,middle,search);
        /**
    int low=0,high=n-1,middle=(low+high)/2;
    
    while(low<=high)
    {
        if(marks[middle]==search)
        {
            System.out.println("Found at Position "+(middle+1)+" in Sorted Order");
            break;
        }
        else if(marks[middle]<search)
        {
            low=middle+1;
        }
        else
        {
            high=middle-1;
        }

        middle=(low+high)/2;
    }
    if(low>high)
    {
        System.out.println("Not Found");
    }
    */
}
/**
 * @rabdya
 * @santhosh
 * @param marks
 * @param low
 * @param high
 * @param middle
 * @param search
 */
public static void bin_search(int marks[],int low,int high,int middle,int search) {
    
    while(low<=high)
    {
        if(marks[middle]==search)
        {
            System.out.println("Found at Position "+(middle+1)+" in Sorted Order");
            break;
        }
        else if(marks[middle]<search)
        {
            low=middle+1;
        }
        else
        {
            high=middle-1;
        }

        middle=(low+high)/2;
    }
    if(low>high)
    {
        System.out.println("Not Found");
    }
    
}
}