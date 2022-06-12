class Student extends Teacher
{
    float marks;
    
void setMarks(float marks )
{
    this.marks=marks;
}

float  getMarks()
{
return marks;
}

}

public class inh2{
    public static void main(String[] args) {
        Student s=new Student();
        
        s.setId(123);
        s.setName("RAJU");
        s.setSal(123.567f);
        s.setMarks(476.98f);
        s.setAdd("H.No 1-145 PKD,PITLAM,KAMAREDDY,TS,503310");
        System.out.println("Name is "+s.getName());
        System.out.println("Id is "+s.getId());
        System.out.println("Salary  is "+s.getSal());
        System.out.println("Address is "+s.getAdd());
        System.out.println("Address is "+s.getMarks());
    }   
}