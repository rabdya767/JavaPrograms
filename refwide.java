class wide1
{
    void show()
    {
        System.out.println("Super Class Method");
    }
}

class wide2 extends wide1
{
    void show1()
    {
        System.out.println("Sub Class Method");
    }

}
public class refwide {

    public static void main(String[] args) {
    //50% functionality
    //wide1 w11=new wide1();
    //w11.show();
    wide1 w1=(wide1)new wide2();
    w1.show();
    }
}