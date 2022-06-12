public class th2 extends Thread
{


    public void run()
    {
        int i=1;
        while(i<15)
        {
            System.out.println(i+" --> Hello");
            i++;
        }
    }


    public static void main(String args[])
    {
        th2 t=new th2();
        t.start();
        int i=1;
        while(i<15)
        {
            System.out.println(i+" --> World");
            i++;
        }
    }
}
