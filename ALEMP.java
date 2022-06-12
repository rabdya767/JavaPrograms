import java.io.*;
import java.util.*;
import java.lang.Integer;

class EmpRabdya
{
    int id;
    String name;
    float sal;

    EmpRabdya(int i,String s,float sal)
    {
        id=i;
        name=s;
        this.sal=sal;
    }

    void display()
    {
        System.out.println("ID "+id);
        System.out.println("NAME "+name);
        System.out.println("SALARY "+sal);
    }
}

public class ALEMP
{
    public static void main(String args[]) throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        ArrayList<EmpRabdya>al=new ArrayList<EmpRabdya>();

        System.out.println("Enter the no.of Objects");
        int n=Integer.parseInt(br.readLine());
        for(int i=0;i<n;i++)
        {
            System.out.println("******EMPLOYEE "+(i+1)+"******");
            System.out.println("Enter the emp ID");
            int id=Integer.parseInt(br.readLine());

            System.out.println("Enter the emp  NAME");
            String name=br.readLine();

            System.out.println("Enter the emp SALARY");
            float sal=Float.parseFloat(br.readLine());

            EmpRabdya obj=new EmpRabdya(id, name, sal);
            al.add(obj);
        }

        for(int i=0;i<n;i++)
        {
            System.out.println("******EMPLOYEE "+(i+1)+"******");
            EmpRabdya obj=al.get(i);
            obj.display();
        }
    }
}