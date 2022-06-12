import java.io.*;
import java.lang.Integer;
class BankAccnt
{
    private double bal;
    
    BankAccnt(double bal)
    {
        this.bal=bal;
    }

    void contact(double r) throws IOException
    {
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter your passwd? ");
        String pswd=br.readLine();
        if(pswd.equalsIgnoreCase("RaBDYa"))
        {
            Interest1 in=new Interest1(r);
            in.calculateInterest();
        }
        else{
            System.out.println("You are not Authorized? ");
        //   return ;
        }
    }

    private class Interest1 
        {
            private double r;
            Interest1(double r)
            {
                this.r=r;
            }
            void calculateInterest()
            {

                double interest=bal*r/100;
                bal+=interest;
                System.out.println("Updated Bal is "+bal);
            }
        }
            
}
public class Bank {
    public static void main(String[] args) throws IOException {

        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter Initial bal ");
        int x=Integer.parseInt(br.readLine());
        BankAccnt ba=new BankAccnt(x);
        ba.contact(2.5);
    }
}