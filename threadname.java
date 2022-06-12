class mt extends Thread
{
    public mt(String name)
    {
        super(name);
        setPriority(Thread.MAX_PRIORITY);
    }
}

public class threadname
{
    public static void main(String[] args) {
        mt t=new mt("Thread 1");
        System.out.println(t.getName());
        System.out.println(t.getId());
        System.out.println(t.getPriority());
        System.out.println(t.getState());
        System.out.println(t.isDaemon());

    }
}