abstract class Car
{
int regNo;

Car(int regNo)
{
    this.regNo=regNo;
}

public void openTank()
{
System.out.println("Fill The Tank....\nCompleted......");
}

abstract void braking(int force);
abstract void steering(String direction, int angle);
abstract void gearbox(String str);

}

class Maruthi extends Car
{
    Maruthi(int regNo)
    {
        super(regNo);
    }

    public void braking(int force)
    {
        System.out.println("Maruthi Car have Hydralic Brakes ");
        System.out.println("Brakes are apllied with a force of "+force+"Newton");
    }


    public void steering(String direction,int angle)
    {
        System.out.println("Maruthi car is turned at an angle of "+angle+" degrees with Manual Steering");
        System.out.println("Maruthi car is turned in "+direction+" direction");
    }

    public void gearbox(String str)
    {
        System.out.println("Maruthi cars have "+str+" Gears");
    }
}

class Honda extends Car
{
    Honda(int regNo)
    {
        super(regNo);
    }

    public void steering(String direction,int angle)
    {
        System.out.println("Honda car is turned at an angle of "+angle+" degrees with Ordinary Steering");
        System.out.println("Honda car is turned in "+direction+" direction");
    }

    public void braking(int force)
    {
        System.out.println("Honda car have Gas Brakes \nApplied at a force of "+force+"Newton");
    }

    public void gearbox(String str)
    {
        System.out.println("Honda cars have "+str+" Gears");
    }

}

public class UseCar 
{
 public static void main(String[] args)
 {
    Car ref;
    Maruthi mobj=new Maruthi(1001);
    Honda hobj=new Honda(5555);
    ref=mobj;
    ref.gearbox("Automatic");
    ref.openTank();
    ref.braking(75);
    ref.steering("Right",45);
 
    System.out.println("\n\n");

    ref=hobj;
    ref.gearbox("Manual");
    ref.openTank();
    ref.braking(75);
    ref.steering("Right",45);
 
}   
}