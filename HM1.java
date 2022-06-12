import java.util.*;
import java.io.*;
import java.lang.Integer;
public class HM1 {
    public static void main(String[] args) throws IOException,InterruptedException{
        HashMap<String,String>hm=new HashMap<String,String>(10,0.75f);
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        //Collections.synchronizedMap(hm);
        String s,ph,nl;
        int ch=Integer.MAX_VALUE;
        while(true)
        {
            System.out.println("\n\n*****PHONE BOOK*****\n\n");
            System.out.println("1.Enter DATA");
            System.out.println("2.get PHONE NUMBER");
            System.out.println("3.DISPLAY all DATA");
            System.out.println("4.display NAMES");
            System.out.println("5.display PHONE NUMBERS");
            System.out.println("6.CLEAR");
            System.out.println("7.IS_EMPTY");
            System.out.println("8.SIZE");
            System.out.println("9.EXIT");
            System.out.println("Enter Your Choice");
            try{
            ch=Integer.parseInt(br.readLine());
            }
            catch(NumberFormatException ne)
            {
                System.out.println(ne);
                System.out.println("Enter only Integers");
                continue;
            }
            switch(ch)
            {
                case 1:
                        System.out.println("Enter Name");
                        s=br.readLine();
                        s=s.trim().toUpperCase();
                        System.out.println("Enter Phone Number");
                        ph=br.readLine();
                        ph=ph.trim();
                        hm.put(s,ph);
                        break;

                case 2:
                        System.out.println("Enter Name");
                        s=br.readLine();
                        s=s.trim();
                        s=s.toUpperCase();
                        nl=null;
                        ph=hm.get(s);
                        if(ph==nl)
                        {
                                System.out.println("Does not Find PHONE NUMBER");
                        }
                        else
                        {
                        System.out.println(s+" ---> "+ph);
                        }
                        break;

                case 3:
                        System.out.println("Total DATA is ");
                        System.out.println(hm);
                        break;

                case 4: 
                        Set<String>set=new HashSet<String>();
                        set=hm.keySet();
                        System.out.println("Names of PHONE BOOK are "+set);
                        break;
                case 5:
                       System.out.println("PHONE NUMBERS are");
                       System.out.println(hm.values());
                       break;

                case 6: 
                        System.out.println("Clearing the HASHMAP\nPlease wait.....");
                        Thread.sleep(1000);
                        hm.clear();
                        System.out.println("Done...");
                        break;

                case 7:
                        if(hm.isEmpty())
                        {
                            System.out.println("HashMap is EMPTY");
                        }
                        else
                        {
                            System.out.println("HashMap is NOT_EMPTY");
                        }
                        break;
                case 8:
                        System.out.println("SIZE of the HashMap is "+hm.size());
                        break;
                case 9:
                        System.out.println("Are you sure to EXIT\nEnter Y or N");
                        String str=br.readLine();
                        String str1="y";
                        String str2="n";
                        str=str.toLowerCase();
                        if(str1.equals(str))
                        {
                        System.exit(0);
                        }
                        else if(str2.equals(str))
                        {
                         continue;
                        }
                        else
                        {
                            System.out.println("Inavalid choice");
                        }
                        break;

                default: System.out.println("Invalid Choice Try Again");
                         break;
            }
        }
    }
}
