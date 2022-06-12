import java.lang.NumberFormatException;
public class cmd {
    public static void main(String[] args) throws NumberFormatException{
        double sum=0;
        for(String d:args)
        {
            if(Double.parseDouble(d)>0||Double.parseDouble(d)<0)
            {
            sum+=Double.parseDouble(d);
            }
        }
        System.out.println(sum);
    }   
}