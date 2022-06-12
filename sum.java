import java.util.Scanner;
public class sum {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int x,y,z;
        System.out.println("Enter the value of x");
        x=sc.nextInt();
        System.out.println("Enter the value of y");
        y=sc.nextInt();
        
        z=x+y;
        System.out.println("The Sum of "+x+" and "+y+" is "+z);
        sc.close();
    }
}
