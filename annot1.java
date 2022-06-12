class parent_class
{
    @Deprecated
    public void display()
    {
        System.out.println("Parent Class Display Method");
    }
}

class child_class extends parent_class
{
    @Override
    public void display()
    {
        System.out.println("Child Class Display Method");
    }
}

public class annot1 {
    public static void main(String[] args) {
    child_class obj = new child_class();
    obj.display();    
}
}