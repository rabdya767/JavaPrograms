import java.lang.Class;

interface MyPrinter
{
    void connect();
    void dis_connect();
}

class IBM implements MyPrinter
{
    public void connect()
    {
        System.out.println("Connected to IBM printer\nWork completed");
    }

    public void dis_connect()
    {
      System.out.println("Dis Connected from IBM printer");  
    }
}

class EpsonPrinter implements MyPrinter
{
    public void connect()
    {
     System.out.println("Connected to EpsonPrinter\nWork Completed");  
    }

    public void dis_connect()
    {
        System.out.println("Dis Connected from EpsonPrinter");
    }

}

public class Printer
{
 public static void main(String[] args) throws ClassNotFoundException,InstantiationException,IllegalAccessException
 {
    //Class c=Class.forName(args[0]);
    @SuppressWarnings("deprecation")
    MyPrinter ref=(MyPrinter)Class.forName(args[0]).newInstance();
    ref.connect();
    ref.dis_connect();

 }   
}