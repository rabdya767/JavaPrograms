import java.io.FileInputStream;
import java.io.FileOutputStream;

public class cpfile {
    public static void main(String[] args) {
        try {
            FileInputStream fin = new FileInputStream("src.txt");
            FileOutputStream fout = new FileOutputStream("des.txt");

            int x;
            while ((x = fin.read()) != -1) {
                if(x>=65 && x<=90)
                {
                    fout.write(x+32);
                }
                else
                {
                    fout.write(x);
                }
            }
            fout.close();
            fin.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
