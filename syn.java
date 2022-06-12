public class syn {
 public static void main(String[] args) {
    MyData d=new MyData();

    mth1 t1=new mth1(d);
    mth2 t2=new mth2(d);
    t1.start();
    t2.start();


 }   
}

class mth1 extends Thread
{
    MyData m1;
    mth1(MyData data1)
    {
        m1=data1;
    }
    public void run()
    {
        m1.display("hello world!");
    }
}

class mth2 extends Thread
{
    MyData m2;
    mth2(MyData data2)
    {
        m2=data2;
    }

    public void run()
    {
        m2.display("GOOD_MORNING");
    }
}


class MyData
{
    //synchronized public void display(String str)
    public void display(String str)
    {
        synchronized(this)
        {
        for(int i=0;i<str.length();i++)
        {
            System.out.print(str.charAt(i)+"");
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
}