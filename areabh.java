import java.util.Scanner;
public class areabh {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);  
        System.out.println("Enter the value of base? ");
        float b=sc.nextFloat();
        System.out.println("Enter the value of height? ");
        float h=sc.nextFloat();
        double Area=0.5*b*h;
        System.out.println("Area of the Triangle is "+Area);
        sc.close();
    }   
}