import java.util.*;

/* Name of the class has to be "Main" only if the class is public. */
public class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
        Scanner sc=new Scanner(System.in);
        int amt=sc.nextInt();
        float iamt=sc.nextFloat();
        if(amt%5==0 && amt<=iamt)
        {
            iamt=iamt-(float)amt-0.5f;
            System.out.printf("%.2f",iamt);
        }
    else if(amt>iamt)
    {
        System.out.printf("%.2f",iamt);
    }
    else
    {
        System.out.printf("%.2f",iamt);
    }
    sc.close();
	}
}