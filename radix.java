import java.util.Scanner;
public class radix
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        sc.useRadix(2);
        System.out.println("Enter x in binary ");
        int x=sc.nextInt();
        System.out.println(x);
        sc.close();
        
    }
}