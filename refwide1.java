class wide11
{
    void show1()
    {
        System.out.println("Super Class Method");
    }
}

class wide22 extends wide11
{
    void show1()
    {
        System.out.println("Sub Class Method");
    }

}
public class refwide1 {
    public static void main(String[] args) {

        //50% functionality
        //wide22 w11=new wide22();
        //w11.show1();
        wide11 w1=(wide11)new wide22();
        w1.show1();
    }
}