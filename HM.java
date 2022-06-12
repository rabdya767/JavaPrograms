import java.io.*;
import java.lang.Integer;
public class HM
{
    public static void main(String[] args)throws IOException
    {
        int ch=100;
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        while(true)
        {
            System.out.println("*****NUMBER TO WORDS*****");
            System.out.println("0\n1\n2\n3\n4\n5\n6\n7\n8\n9\n");
            System.out.println("Select your Choice");
           try{
            ch=Integer.parseInt(br.readLine());
           }
           catch(NumberFormatException ne)
           {
               System.out.println(ne+"\nSry You Entered String");
               System.exit(0);
           }
           
           switch(ch)
           {
               case 0:
                        System.out.println("ZERO");
                        break;
               case 1:
                        System.out.println("ONE");
                        break;
               case 2:
                        System.out.println("TWO");
                        break;
        
               case 3:
                        System.out.println("THREE");
                        break;
               case 4:
                        System.out.println("FOUR");
                        break;
               case 5:
                        System.out.println("FIVE");
                        break;
               case 6:
                        System.out.println("SIX");
                        break;
               case 7:
                        System.out.println("SEVEN");
                        break;
               case 8:
                        System.out.println("EIGHT");
                        break;
               case 9:
                        System.out.println("NINE");
                        break;
               default: System.out.println("It is a NON-DIGIT CHARACTER");
                        break;
                
           }

        }

    }
}