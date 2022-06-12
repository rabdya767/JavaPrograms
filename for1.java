import java.util.Scanner;
public class for1 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of x");
        int x=sc.nextInt();
        for(int i=1;i<11;i++)
        {
            System.out.println(x+" * "+i+" = "+(x*i));
        }
        sc.close();   
    }    
}