import java.io.FileInputStream;

public class file3 {

    public static void main(String[] args) {
        
        try{
            FileInputStream fin=new FileInputStream("File1.txt");
            int x;
            while((x=fin.read())!=-1)
            {
                System.out.print((char)x);
            }
            fin.close();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }

            /**
              byte b[]=new byte[fin.available()];
              fin.read(b);
              String str=new String(b);
              System.out.println(str);
              fin.close();
          }
        catch(Exception e)
         {
            System.out.println(e);
         }
        */
    }
}
