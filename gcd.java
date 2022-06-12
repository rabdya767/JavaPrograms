import java.util.Scanner;

public class gcd {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Two Numbers? ");
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        sc.close();
        int gcd=1;
        for(int i=1;i<=n1 && i<=n2;i++)
        {
            if(n1%i==0 && n2%i==0)
            {
                gcd=i;
            }
        }
        System.out.println("GCD of "+n1+" and "+n2+" is "+gcd);
        /*
        while(n1!=n2)
        {
            if(n1>n2)
            {
                n1=n1-n2;
            }
            else
            {
                n2=n2-n1;
            }
        }
        System.out.println("Gcd is "+n2);
        */
    }
}