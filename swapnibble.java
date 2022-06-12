import java.util.*;

public class swapnibble {
public static void main(String args[]) throws Exception
{
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
    int rt=n&0b00001111;
    int lf=n&0b11110000;
    lf=lf>>4;
    rt=rt<<4;
	int res=rt|lf;
	System.out.println("\n"+res);
	sc.close();	
}	
}