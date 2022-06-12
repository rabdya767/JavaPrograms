import java.util.*;

public class MainCls
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int t=sc.nextInt();
long ans[]=new long[t];
while(t-->0)
{
long n=sc.nextInt();
ans[t]=fact(n);
}
sc.close();
System.out.println();
for(int i=0;i<ans.length;i++)
{
    System.out.println(ans[ans.length-1-i]);
}
}

public static long  fact(long num)
{
long factn=1;
if(num==1||num==0)
{
factn=1;
}
else
{
for(int i=2;i<num+1;i++)
{
    factn=factn*i;
}
}
return factn;
}
}