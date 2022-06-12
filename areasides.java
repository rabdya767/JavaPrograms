import java.util.Scanner;
public class areasides {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the 1st side of the Triangle? ");
        float a = sc.nextFloat();
        System.out.println("Enter the 2nd side of the Triangle? ");
        float b = sc.nextFloat();
        System.out.println("Enter the 3rd side of the Triangle? ");
        float c = sc.nextFloat();
        float s = (a + b + c) / 2;
        double Area = Math.sqrt(s * (s - a) * (s - b) * (s - c));
        System.out.println("Area of the Triangle is " + Area);
        sc.close();
    }
}