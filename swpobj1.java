final class Employee1
{
    int id1,id2;
    Employee1(int id1,int id2)
    {
        this.id1=id1;
        this.id2=id2;
    }
}

final class Check1{
    void swap(Employee1 x)
    {
        int temp;
        temp=x.id1;
        x.id1=x.id2;
        x.id2=temp;
    }
}

public class swpobj1 {
 public static void main(String[] args) {
    Employee1 e1=new Employee1(10,20);

    Check1 obj=new Check1();
    System.out.println(e1.id1+"\t"+e1.id2);
    obj.swap(e1);
    System.out.println(e1.id1+"\t"+e1.id2);
 }   
}