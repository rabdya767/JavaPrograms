import java.util.Scanner;
public class fib 
{
    public static void main(String[] args) 
    {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the No.Of terms in Fib Series?");
        int n=sc.nextInt();
        int f1=0,f2=1,f;
        sc.close();
        System.out.print(f1+"\t"+f2+"\t");
        /**
         * int i=3;
         * while(i<=n)
         */
        for(int i=3;i<=n;i++)
        {
            f=f1+f2;
            System.out.print(f+"\t");
            f1=f2;
            f2=f;
            i++;
        }
    }
}