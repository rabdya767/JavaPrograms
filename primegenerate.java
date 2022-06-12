import java.util.Scanner;
class Prime
{
static boolean checkprime1(int num)
    {
    boolean isPrime=true;
    for(int i=2;i<num-1;i++)
    {
        if((num%i)==0) 
            isPrime=false;
    }
    return isPrime;
    }

/**
static int checkprime(int num)
{
int isPrime=1;
for(int i=2;i<num-1;i++)
{
    if((num%i)==0) 
        isPrime=0;
}
return isPrime;
}
*/

static void generate(int max)
{
int c=1,num=2;
while(c<=max)
{
    if(checkprime1(num))
    {
        System.out.print(num+"\t");
        c++;
    }
    num++;
}
}
}

public class primegenerate {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the NoOf Primes u want? ");
    int n=sc.nextInt();
    Prime.generate(n);
    sc.close();
}
}