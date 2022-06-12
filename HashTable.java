import java.io.*;
import java.util.*;
import java.lang.Integer;
public class HashTable
{
    public static void main(String[] args) throws IOException,InterruptedException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in)); 
        Hashtable<String,String>ht=new Hashtable<String,String>(10,0.75f);

        ht.put("ABD","875");
        ht.put("VIRAT","987");
        ht.put("MAXI","645");
        ht.put("YUZI","534");
        ht.put("siraj".toUpperCase(),"487");
        ht.put("KyLe JamieSoN".toUpperCase(),"934");
        ht.put("dDp".toUpperCase(),"156");
        ht.put("Ahmed".toUpperCase(),"457");
        ht.put("Kane RechardSon".toUpperCase(),"856");

        String Key,Value;
        int ch=Integer.MAX_VALUE;
        while(true)
        {
        
            System.out.println("*****IPL21*****");
            System.out.println("1.Enter DATA");
            System.out.println("2.get SCORE of PLAYER");
            System.out.println("3.DISPLAY all DATA");
            System.out.println("4.display PLAYER NAMES");
            System.out.println("5.display PLAYERS SCORES");
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
                continue;
            }
        switch(ch)
        {
            case 1: System.out.println("Enter the PLAYER NAME");
                    Key=br.readLine();
                    Key=Key.trim().toUpperCase();
                    System.out.println("Enter the SCORE of PLAYER");
                    Value=br.readLine();
                    ht.put(Key, Value);
                    break;

            case 2:
                    System.out.println("Enter PLAYER name");
                    Value=br.readLine();
                    Value=Value.trim().toUpperCase();
                    String nl=null;
                    Key=ht.get(Value);
                    if(nl==Key)
                    {
                        System.out.println("Cannot Find PLAYER SCORE");
                    }
                    else
                    {
                    System.out.println(Value+" ---> "+Key);
                    }
                    break;

            case 3:
                    System.out.println("\n\nTotal DATA is \n\n");
                    System.out.println(ht);
                    break;

            case 4:
                    /**   
                    Enumeration<String>en=ht.keys();
                    System.out.println("All PLAYERS names are ");

                    while(en.hasMoreElements())
                    {
                        System.out.print(en.nextElement().toUpperCase()+"\t");
                    }
                    System.out.println();
                     */
                    Set<String>st=new HashSet<String>();
                    st=ht.keySet();
                    System.out.println("All PLAYERS names are "+st);
                    break;

            case 5:
                    System.out.println("\n\nAll PLAYER SCORES are\n\n");
                    System.out.println(ht.values());
                    break;

            case 6:
                    System.out.println("Clearing the DATA.Please wait....");
                    Thread.sleep(1000);
                    ht.clear();
                    System.out.println("Done");
                    break;

            case 7:
                    if(ht.isEmpty())
                    {
                        System.out.println("HashTable is EMPTY");
                    }
                    else
                    {
                        System.out.println("HashTable is NOT_EMPTY");
                    }
                    break;

            case 8:
                    System.out.println("SiZE of the HASHTABLE is "+ht.size());
                    break;

            case 9:
                    System.out.println("Are You To Exit\nEnter Y or N\n");
                    String str=br.readLine();
                    String yes="Y";
                    String no="N";
                    str=str.toUpperCase();
                    if(yes.equals(str))
                    {
                        System.exit(0);
                    }
                    else if(no.equals(str))
                    {
                        continue;
                    }
                    else
                    {
                        System.out.println("Invalid choice Sorry");
                    }
                    break;

            default:
                    System.out.println("Invalid Choice Try Again\n");
                    break;
        }
        }
    }
}