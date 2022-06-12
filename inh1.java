class Teacher
{
int id;
float sal;
String name,address;

void setId(int id)
{
    this.id=id;
}

void setSal(float sal)
{
    this.sal=sal;
}

void setName( String Name)
{
    this.name=Name;
}
void setAdd(String address)
{
    this.address=address;
}

int getId()
{
return id;
}

float getSal()
{
return sal;
}

String getName()
{
return name;
}

String getAdd()
{
return address;
}
}

public class inh1 {
    public static void main(String[] args) {
        Teacher obj=new Teacher();
        obj.setId(123);
        obj.setName("RAJU");
        obj.setSal(123.567f);
        obj.setAdd("H.No 1-145 PKD,PITLAM,KAMAREDDY,TS,503310");
        System.out.println("Name is "+obj.getName());
        System.out.println("Id is "+obj.getId());
        System.out.println("Salary  is "+obj.getSal());
        System.out.println("Address is "+obj.getAdd());
    }
}