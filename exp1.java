import java.lang.Integer;

public class exp1 {
 public static void main(String args[]) {
    System.out.println("Open files");
    int n=args.length;
    System.out.println("N = "+n);

    int a=n/Integer.parseInt(args[0]);
    System.out.println(a);
/**
 * C:\Users\SANTHOSH RABDYA\Desktop\pgrms\java>java exp1
Open files
N = 0
Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0
        at exp1.main(exp1.java:8)

C:\Users\SANTHOSH RABDYA\Desktop\pgrms\java>java exp1 12 36 78 90
Open files
N = 4
0

C:\Users\SANTHOSH RABDYA\Desktop\pgrms\java>java exp1 2 36 78 90  
Open files
N = 4
2

C:\Users\SANTHOSH RABDYA\Desktop\pgrms\java>java exp1 0 36 78 90 
Open files
N = 4
Exception in thread "main" java.lang.ArithmeticException: / by zero
        at exp1.main(exp1.java:8)

 */
 }   
}