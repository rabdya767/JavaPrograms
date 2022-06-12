import java.lang.Integer;
public class exp2 {
public static void main(String[] args) throws Exception {
    try
    {
        System.out.println("Open files");
        int n=args.length;
        System.out.println("N = "+n);

        int a=n/Integer.parseInt(args[0]);
        System.out.println(a);
    }
    catch(ArithmeticException ae)
    {
        ae.printStackTrace();
        System.out.println(ae);
        System.out.println("Please Provide Value other than zero ");
    }
    catch(ArrayIndexOutOfBoundsException ai)
    {
        ai.printStackTrace();
        System.out.println(ai);
        System.out.println("Cannot Access the element");
    }
    finally
    {
        System.out.println("Close All the Files");
    }
}    
}
