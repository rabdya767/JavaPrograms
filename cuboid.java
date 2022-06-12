import java.util.Scanner;
public class cuboid {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Length of the Cuboid? ");
        float l=sc.nextFloat();
        System.out.println("Enter the Breadth of the Cuboid? ");
        float b=sc.nextFloat();
        System.out.println("Enter the Height of the Cuboid? ");
        float h=sc.nextFloat();
        sc.close();
        float TA=2*((l*b)+(b*h)+(h*l));
        float VL=(l*b*h);
        System.out.println("Total Area is "+TA);
        System.out.println("Volume is "+VL);
    }
}