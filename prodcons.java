
class Producer extends Thread
{
sharedata data;
Producer(sharedata d)
{
    data=d;
}

@Override
public void run()
{
int i=1;
while(i<15)
{
    data .set(i);
    System.out.println("Producer --> "+i++);
}
}
}

class Consumer extends Thread
{
    sharedata data;
    Consumer (sharedata d)
    {
    data=d;
    }
    
    @Override
    public void run()
    {
        int count=0;
        while(count<15)
        {
            System.out.println("Consumer --> "+data.get());
            count++;
        }
    }
}

class sharedata 
{
    boolean flag=true;
    int value=0;
    synchronized void set(int x)
    {
        while(flag!=true)
        {
            try{
                wait();
            }
            catch(InterruptedException ie)
            {
                System.out.println(ie);
            }
        }
        value=x;
        flag=false;
        notify();
    }

    synchronized int get()
    {
        int x=0;
        while(flag!=false)
        {
            try{
            wait();
            }
            catch(InterruptedException ie)
            {
                System.out.println(ie);
            }
        }
        x=value;
        flag=true;
        notify();
        
        return x;
    }
}

public class prodcons {
 
    public static void main(String[] args) {
     
        sharedata obj=new sharedata();
        Producer p=new Producer(obj);
        Consumer c=new Consumer(obj);
        p.start();
        c.start();
    }

}

