class Employee
{
    int id;
    Employee(int id)
    {
        this.id=id;
    }
}


class Check{
    void swap(Employee x,Employee y)
    {
        Employee temp;
        temp=x;
        x=y;
        y=temp;
       // System.out.println(x.id+"\t"+y.id);
    }
}

public class swpobj {
 public static void main(String[] args) {
    Employee e1=new Employee(10);
    Employee e2=new Employee(20);

    Check obj=new Check();
    System.out.println(e1.id+"\t"+e2.id);
    obj.swap(e1,e2);
    System.out.println(e1.id+"\t"+e2.id);
 }   
}