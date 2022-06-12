public class thri
{
    public static void main(String args[])
    {
        Mythread1 mt=new Mythread1();
        Thread t=new Thread(mt);
        t.start();
        int i=1;
        while(true)
        {
            System.out.println(i+" --> Main");
            i++;
            Thread.yield();
        }
    }
} 

class Mythread1  implements Runnable
{
    @Override
    public void run()
    {
        int i=1;
        while(true)
        {
            System.out.println(i+" --> MyThread");
            i++;
        }
    }
}
