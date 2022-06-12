enum Enum12
{
 CSE,IT,ECE,CIVIL,MECH,BME,EEE;
 private Enum12()
 {
     System.out.println(this.name());
 }
 public void display()
 {
     System.out.println(this.name()+" ---> "+this.ordinal());
 }
}

public class en1
{
    public static void main(String[] args) {
     Enum12 e=Enum12.EEE;
     e.display();

     /*
     Enum1 lt[]=Enum1.values();
     for(Enum1 x:lt)
     {
         System.out.println(x);
     }
     */
     System.out.println(e.name());   
     System.out.println(e.ordinal());
    }
}