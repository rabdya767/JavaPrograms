public class class2
{
    public static void main(String args[]) 
    {
        String names[]={"KISHAN","RAJU","SURESH","BABLU",
                        "PRHLADH","SRINU","SANTHOSH"};
        class1.main(names);  
    }
}

class class1
{
    public static void main(String args[]) 
    {
        for(String s:args)
        {
            System.out.println(s);
        }
    }    
}