import java.util.Scanner;

public class arrayinsert
{
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the No.of Elements?");
        int n=sc.nextInt();
        int array[]=new int[n+1];
        for(int i=0;i<n;i++)
        {
            System.out.printf("Enter array[%d]  Element  ",(i+1));
            array[i]=sc.nextInt();                
        }
        System.out.println();
        for(int i=0;i<n;i++)
        {
            System.out.print(array[i]+"\t");
        }
        System.out.println();
        insert_position(array,n);
        sc.close();
    }
    public static void insert_position(int arr[],int n) {

        Scanner sc1=new Scanner(System.in);
        System.out.println("Enter the  Element");
        int x=sc1.nextInt(); 
        System.out.println("Enter the  Position");
        int pos=sc1.nextInt();
        int temp=pos;
        if(pos>arr.length)
        {
            System.out.println("Can't Insert Index Out of Bound ");
        } 
        else
        {
            for(int i=n-1;i>=pos;i--)
            {
                arr[i+1]=arr[i];
            }
            arr[temp]=x;
        }

        for(int j:arr){
            System.out.print(j+"\t");
        }
            sc1.close();
    }
}