import java.io.*;
class Sample_Exp3
{
    private String Name;
    void accept() throws IOException
    {
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter Your Name");
        Name=br.readLine();
    }

    void display()
    {
        System.out.println("Name "+Name);
    }
}

public class exp3
{
    public static void main(String[] args) throws IOException
    {
        Sample_Exp3 ref=new Sample_Exp3();
        ref.accept();
        ref.display();
    }
}