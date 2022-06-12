public class REPSUB
{
    public static void main(String[] args) 
    {
    String s=new String("There is a beatiful Girl");
    s=s.replace("Girl","Flower");
    System.out.println(s); 
    System.out.println(s.indexOf('F'));  
    String sub=s.substring(20);
    System.out.println(sub);
    String substring=s.substring(11,19);
    System.out.println(substring); 
    }
}