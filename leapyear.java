import java.util.Scanner;
public class leapyear
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter The Year? ");
        int year=sc.nextInt();
        sc.close();
        if(((year%100)==0) & (year%400==0) || (((year%100)!=0)&((year%4)==0)))
        {
            System.out.println(year+" is a Leap Year");
        }
        else
        {
            System.out.println(year+" is NOT a Leap Year");
        }
    }
}