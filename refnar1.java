class nar1
{
    void show()
    {
        System.out.println("Super Class Method");
    }
}

class nar11 extends nar1
{
    void show1()
    {
        System.out.println("Sub Class Method");
    }

}
public class refnar1 {
    //100% functionality
    public static void main(String[] args) {
        nar11 obj1=new nar11();
        obj1.show();
        obj1.show1();


    }
}