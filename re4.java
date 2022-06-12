public class re4 
{
    public static void main(String[] args) 
    {
        
               String str="R";
               String i="1";
               String c="C";
               String space=" ";
                       
               System.out.println(space.matches("\\W?"));
               System.out.println(c.matches("\\w?"));    
               System.out.println(str.matches("[\\D]?"));
               System.out.println(i.matches("[\\D]?"));
               System.out.println(str.matches("[\\d]?"));
               System.out.println(i.matches("[\\d]?"));
               System.out.println(space.matches("\\s*"));
               System.out.println(c.matches("\\S*"));    
           
               
    }   
}