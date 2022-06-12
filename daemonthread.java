public class daemonthread
{
    public static void main(String args[])
    {
        Mythread11 mt=new Mythread11();
        Thread t=new Thread(mt);
        t.setDaemon(true);
        t.start();

        try{
            Thread.sleep(100);
        }
        catch(Exception e)
        {
            System.out.println("Mg");
        }
        
    }
} 

class Mythread11  implements Runnable
{
    @Override
    public void run()
    {
        int i=1;
        while(true)
        {
            System.out.println(i+" --> Hello");
            i++;
            Thread.yield();
        }
    }
}
