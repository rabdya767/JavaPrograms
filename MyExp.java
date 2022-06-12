public class MyExp extends Exception
{
private static int accno[]={1001,2002,3003,4004,5005,6006,7007,8008,9009};
private static String Name[]={"A","B","C","D","E","F","G","H","I"};
private static double bal[]={5624.78,564.76,778.53,897.23,342.12,567.09,879.43,1223.45,554.00};

    MyExp(){}
    MyExp(String S)
    {
        super(S);
    }
 public static void main(String[] args) 
    {
        try
        {
            System.out.println("AccNo\tName\tBalance");
            for(int i=0;i<accno.length;i++)
            {
                System.out.println(accno[i]+"\t "+Name[i]+"\t"+bal[i]);
                if(bal[i]<500)
                {
                    MyExp me=new MyExp("Minimum Bal req");
                    throw me;
                }
            }
        }
        catch(MyExp me)
        {
            me.printStackTrace();
            //System.out.println(me);
        }
    }
}