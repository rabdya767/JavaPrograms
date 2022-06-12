@FunctionalInterface
interface myinter1
{
    void display();
}

class my implements myinter1
{
    public void display()
    {
        System.out.println("Hello World");
    }
}

public class lambdaa1 {
    public static void main(String[] args) {
        myinter1 m=()->
        {
            System.out.println("Hello World");
        };
        m.display();
        
        /*
        myinter1 m=new myinter1()
            {
                public void display() {
                    System.out.println("Hello World");
                }
            };
        m.display();
        */
    }
}
