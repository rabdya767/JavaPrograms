import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.SequenceInputStream;

public class cp1 {
    public static void main(String[] args) {
        try {
            FileInputStream fin = new FileInputStream("src.txt");
            FileInputStream fin1 = new FileInputStream("des.txt");

            FileOutputStream fout = new FileOutputStream("final.txt");

            SequenceInputStream sis=new SequenceInputStream(fin,fin1);
            int x;
            while ((x = sis.read()) != -1) {
                    fout.write(x);
                }
            
            fout.close();
            fin.close();
            fin1.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
