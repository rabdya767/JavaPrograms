import java.util.Scanner;
class Sample
{
    float sqrt (float num)
    {
        float x;
        x=(float)Math.sqrt(num);
        return x;
    }
}
public class sqrt_num {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Value of X? ");
        int num=sc.nextInt();
        Sample S=new Sample();
        System.out.println("Sqrt of "+num+" is "+S.sqrt(num));
        sc.close();
    }
}