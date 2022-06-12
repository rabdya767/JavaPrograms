import java.util.Scanner;
public class arrayinsert1
{
    
    public static void main(String[] args) {
        int arr[]={1,5,6,4,9};

        System.out.println();

        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+"\t");
        }
        System.out.println();
        insert_position(arr);
    }
    public static void insert_position(int arr[]) {

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
            for(int i=arr.length-1;i>pos;i--)
            {
                arr[i]=arr[i-1];
            }
            arr[temp]=x;
        }

        for(int j:arr){
            System.out.print(j+"\t");
        }
            sc1.close();
    }
}