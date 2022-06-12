import java.util.Scanner;

public class arrayinsert3
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
        insert_position(array,n);
        sc.close();
    }
    public static void insert_position(int arr[],int n) {

        int arr1[]=new int[n+1];
        Scanner sc1=new Scanner(System.in);
        System.out.println("Enter the  Element");
        int x=sc1.nextInt(); 
        System.out.println("Enter the  Position");
        int pos=sc1.nextInt();
        if(pos>arr.length)
        {
            System.out.println("Can't Insert Index Out of Bound ");
            System.exit(1);
        } 
        else
        {
           for(int i=0;i<pos;i++)
           {
               arr1[i]=arr[i];
           }

           
           arr1[pos]=x;
           
           for(int i=pos+1;i<=n;i++)
           {
               arr1[i]=arr[i-1];
           }

        }

        for(int j:arr1){
            System.out.print(j+"\t");
        }
            sc1.close();
    }
}