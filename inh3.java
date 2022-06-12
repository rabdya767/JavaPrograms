class One
{
    int i=10;
    void show()
    {
        System.out.println("Super Class \"i\" is "+i);
    }
}

class Two extends One
{
    int i=20;
    void show()
    {
        super.show();
        System.out.println("Sub Class \"i\" is "+i);
        //System.out.println("Super  Class \"i\" is "+super.i);        
    }
}
public class inh3 {
    public static void main(String[] args) {
        Two t=new Two();
        t.show();
    }
}