class One1
{

    One1  ()
    {
        System.out.println("Super Class Constructor");
    }
}

class Two1 extends One1
{
    Two1()
    {
        System.out.println("Sub Class Constructor");        
    }
}
public class inh4 {
    public static void main(String[] args) {
    
        Two1 t=new Two1();
        System.out.println(t.hashCode());
    }
}