interface Father
{
    float HT=6.02f;
    void height();
}

interface Mother
{
    float HT=5.86f;
    void height();
}

class child implements Father,Mother
{
    public void height()
    {
        float HT=(Father.HT+Mother.HT)/2;
        System.out.println("child's height is "+HT);
    }
}

public class Multi 
{
 public static void main(String[] args) 
 {
     child obj=new child();
     obj.height();
 }   
}