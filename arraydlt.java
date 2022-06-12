import java.util.Scanner;

public class arraydlt
{
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the No.of Elements?");
        int n=sc.nextInt();
        int array[]=new int[n];
        for(int i=0;i<n;i++)
        {
            System.out.printf("Enter array[%d]  Element  ",(i+1));
            array[i]=sc.nextInt();                
        }
        System.out.println();
        for(int i:array)
        {
            System.out.print(i+"\t");
        }
        System.out.println();
        dlt_position(array,n);
        sc.close();
    }
    public static void dlt_position(int arr[],int n) {

        int arr1[]=new int[n-1];
        Scanner sc1=new Scanner(System.in);
        System.out.println("Enter the  Position");
        int pos=sc1.nextInt();
        if(pos>arr.length)
        {
            System.out.println("Can't delete Index Out of Bound ");
            System.exit(1);
        } 
        else
        {
           for(int i=0;i<pos;i++)
           {
               arr1[i]=arr[i];
           }
           
           for(int i=pos;i<n;i++)
           {
               arr1[i-1]=arr[i];
           }

        }

        for(int j:arr1){
            System.out.print(j+"\t");
        }
            sc1.close();
    }
}