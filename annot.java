/**
 * @author RABDYA_SANTHOSH
 * 
 * Class Library Book
 */

 class annott1 {
    
    /**
     * @value 10 default value Static
     */
    static int val=56;

    /**
     * @value String S
     */
    String s;

    /**
     * Parameterized Constructor
     * @param s Book Name
     */
    public annott1(String s){
        this.s=s;
    }
    
    /**
     * Issue a Book to a Student
     * @param rollno RoolNumber of a Student
     * @throws Exception If book is not available throws Exception
     */

    public void issue(int rollno) throws Exception
    {
        System.out.println("Issued to Student with RollNumber "+rollno);
    }

    /**
     * Check Book is available
     * @param str Book Name
     * @return if Book is avaiable returns true else false 
     */
    public boolean available(String str)
    {
     if(str.equals(s))
     {
         return false;
     }
     else
     {
         return true;
     }
    }

    /**
     * Get Book Name
     * @param id Book id
     * @return returns Book Name
     */
    public String getName(int id)
    {
        return "Book name is "+s+" with Id "+id;
    }
}

public class annot
{
public static void main(String[] args)throws Exception{
 annott1 obj=new annott1("RABDYA");
 System.out.println(obj.available("RABDYA"));  
 System.out.println("RABDYA SANTHOSH"); 
}
}