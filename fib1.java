import java.util.Scanner;
public class fib1 
{
    public static void main(String[] args) 
    {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the last value of FIB");
        int n=sc.nextInt();
        int f1=0,f2=1,f=f1+f2;
        sc.close();
        System.out.print(f1+"\t"+f2+"\t"+f+"\t");
        while(f<=n)
        {
            f1=f2;
            f2=f;
            f=f1+f2;
            if(f>n)
            {
                System.exit(0);
            }
            else
            {
                System.out.print(f+"\t");
            }
        }
    }
}