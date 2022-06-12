import java.util.Scanner;
public class roots {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Co-Efficient of the x^2 in QE? ");
        float a=sc.nextFloat();
        System.out.println("Enter the Co-Efficient of the x in QE? ");
        float b=sc.nextFloat();
        System.out.println("Enter the Co-Efficient of the constant in QE? ");
        float c=sc.nextFloat();
        sc.close();
        double d=((b*b)-(4*a*c));
        double r1,r2;
        if(d>0)
        {
            System.out.println("Root are Real and Distinct ");
            r1=(-b+Math.sqrt(d))/(2*a);
            r2=(-b-Math.sqrt(d))/(2*a);
            System.out.println("Roots are "+r1+" and "+r2);
        }
        else if(d==0)
        {
            System.out.println("Root are Real and Equal ");
            r1=(-b+Math.sqrt(d))/(2*a);
            r2=(-b-Math.sqrt(d))/(2*a);
            System.out.println("Roots are "+r1+" and "+r2);
        }
        else
        {
            System.out.println("Root are Imaginary and Complex ");  
        }   
    }
}