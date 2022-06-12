//import java.util.Scanner;
public class arithmetic {
    public static void main(String[] args) {
        /**
         * Scanner sc=new Scanner(System.in); 
         * System.out.println("Enter the value of x"); 
         * int x=sc.nextInt(); 
         * System.out.println("Enter the value of y"); 
         * int y=sc.nextInt(); 
         * sc.close();
         */
        int y = 10, x = 25;
        System.out.println(x + "+" + y + "=" + (x + y));
        System.out.println(x + "-" + y + "=" + (x - y));
        System.out.println(x + "*" + y + "=" + (x * y));
        System.out.println(x + "/" + y + "=" + (x / y));// quotient
        System.out.println(x + "%" + y + "=" + (x % y));// remainder
    }
}