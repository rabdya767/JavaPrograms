import java.util.Scanner;
public class fact {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Total Numbers ");
        int tn=sc.nextInt();
        for(int k=0;k<tn;k++)
        {
        System.out.println("Enter the Number to find it's Factorial ");
        int n=sc.nextInt();
        int fact=1;
        if(n>0)
        {
        for(int i=1;i<n+1;i++)
        {
            fact=fact*i;
        }
        System.out.println("Factorial of "+n+" is "+fact);
        }
        else if(n==0)
        {
            System.out.println("Factorial of "+n+" is "+fact);
        }
        else
        {
            System.out.println("Factorial of "+n+" is doesn't exist");
        }
    }

        
        sc.close();
    }
    
}
