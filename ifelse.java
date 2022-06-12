import java.util.Scanner;
public class ifelse
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Number? ");
        int x =sc.nextInt();
        if (x<0)
        {
            System.out.println("The Value of "+x+" is negative");
        }            
        else if(x>0)
        {
            System.out.println("The Value of "+x+" is positive");
        }
        else
        {
            System.out.println("The Value of "+x+" is Zero");

        }
        sc.close();

    }
}