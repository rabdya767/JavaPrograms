import java.io.*;


public class typechar 
{
    public static void main(String[] args) throws IOException
        {
            BufferedReader br=new BufferedReader(new InputStreamReader(System.in)); 
            System.out.println("Enter a Character? ");
            //char ch1=(char)br.read();
            char ch=br.readLine().charAt(0);
            System.out.println(ch);

            if(Character.isDigit(ch))
            {
                System.out.println("Digit");
            }
            else if(Character.isUpperCase(ch))
            {
                System.out.println("UpperCase Letter");
            }
            else if(Character.isLowerCase(ch))
            {
                System.out.println("LowerCase Letter");
            }
            else if(Character.isSpaceChar(ch))
            {
                System.out.println("a SpaceChar");
            }
            else if(Character.isWhitespace(ch))
            {
                System.out.println("A white Space(enter,backspace,delete)");
            }
            else
            {
                System.out.println("Other Char");
            }
        }    
}