class useatm
{
 synchronized public void CheckBal(String name)
 {
    System.out.println(name+" checking your balance.\nPlease Wait......");
 }  
  
   

 synchronized public void withdraw(int amount,String name)
 {
     System.out.println(name+" is withdrawing "+amount);
 }
}


class customer extends Thread
{
    int amount;
    String name;
    useatm obj;

    customer(useatm obj,String name,int amount)
    {
        this.obj=obj;
        this.name=name;
        this.amount=amount;
    }

    public void UseAtm()
    {
        obj.CheckBal(name);
        obj.withdraw(amount,name);
    }
    @Override
    public void run()
    {
        UseAtm();
    }
}

public class mainatm
{
    public static void main(String args[])
    {
        useatm ATM=new useatm();
        customer c1=new customer(ATM, "RABDYA", 500);
        customer c2=new customer(ATM, "AJAY", 400);
        c1.start();
        c2.start();

    }
}

