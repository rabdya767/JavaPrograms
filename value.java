public class value 
{
public static void main(String args[])
{
int A=4156,B=4641;
String s="1010";
//returns value in Integer Object type
System.out.println(Integer.valueOf(A));
System.out.println(Integer.valueOf(B));
System.out.println(Integer.valueOf(s,2));
System.out.println(Integer.valueOf("1011",16));
//valueOf("1011",16)=(1*16^3)+(0*16^2)+(1*16^1)+(1*16^0)
//4096+0+16+1=4113
}    
}