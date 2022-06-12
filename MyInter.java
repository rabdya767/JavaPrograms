import java.lang.Class;

interface MyInterface
{
    void connect();
    void dis_connect();
}

class OracleDB implements MyInterface
{
    public void connect()
    {
        System.out.println("Connected to Oracle DB\nWork completed");
    }

    public void dis_connect()
    {
      System.out.println("Dis Connected from Oracle DB");  
    }
}

class SybaseDB implements MyInterface
{
    public void connect()
    {
     System.out.println("Connected to Sybase DB\nWork Completed");  
    }

    public void dis_connect()
    {
        System.out.println("Dis Connected from Sybase DB");
    }

}

public class MyInter 
{
    
 public static void main(String[] args) throws ClassNotFoundException,InstantiationException,IllegalAccessException
 {
    //Class c=Class.forName(args[0]);
    @SuppressWarnings("deprecation")
    MyInterface ref=(MyInterface)Class.forName(args[0]).newInstance();
    ref.connect();
    ref.dis_connect();

     /**
    MyInterface ref;
    OracleDB obj=new OracleDB();
    ref=obj;
    ref.connect();
    ref.dis_connect();
    System.out.println("\n");

    MyInterface ref1=new SybaseDB();
    ref1.connect();
    ref1.dis_connect();
    */
 }   
}