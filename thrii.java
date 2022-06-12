class thrimp implements Runnable 
{
    @Override
    public void run()
    {
    int i=1;
    while(i<10)
    {
        System.out.println(i+" --> World");
        i++;
        try
        {
            Thread.sleep(200);
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}

}

public class thrii {
    public static void main(String[] args) throws InterruptedException,IllegalArgumentException {
        
        Thread t=new Thread(new thrimp());
        t.start();

        int i=1;
        t.interrupt();
        while(i<10)
        {
            System.out.println(i+" --> Hello");
            i++;
            try{
            Thread.sleep(400);
            }
            catch(Exception e)
            {
                System.out.println(e);
            }        
        }
    }
}
