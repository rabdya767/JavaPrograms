class nar0
{
    void show()
    {
        System.out.println("Super Class Method");
    }
}

class nar00 extends nar0
{
    void show1()
    {
        System.out.println("Sub Class Method");
    }

}
public class refnar {
    //0% functionality
    public static void main(String[] args) {

    nar00 n=(nar00)new nar0();
    n.show();
    n.show1();
    }
}