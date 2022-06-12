import java.util.*;
import java.io.*;
import java.lang.Integer;

public class AL1 
{
 public static void main(String[] args) throws IOException,InterruptedException,IllegalArgumentException
 {
    ArrayList<String>al=new ArrayList<String>(12);
    Collections.synchronizedList(al);
    al.add("RCB");
    al.add("DC");
    al.add("KKR");
    al.add("PBKS");
    al.add("SRH");
    al.add("CSK");
    al.add("MI");
    al.add("RR");
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    int choice=0;
    int pos;
    Object obj;
    String element;
    while (choice!=11) 
    {
        Thread.sleep(1000);
        System.out.println("\n\n*****ARRAYLIST OPERATIONS*****\n\n");
        System.out.println("1.ADD");
        System.out.println("2.REMOVE");
        System.out.println("3.DISPLAY");
        System.out.println("4.SEARCH");
        System.out.println("5.REPLACE");
        System.out.println("6.CAPACITY(SIZE)");
        System.out.println("7.CLEAR");
        System.out.println("8.OBJECT CONTAINS");
        System.out.println("9.TO ARRAY");
        System.out.println("10.SUBLIST");
        System.out.println("11.EXIT");
        System.out.println("Enter Your Choice");

        try
        {
            choice=Integer.parseInt(br.readLine());
        }
        catch(NumberFormatException ne)
        {
            System.out.println("Enter Integers Only");
            continue;
        }
        
    
        switch(choice)
        {
            
            case 1: System.out.println("\n\n*****ARRAYLIST ADD OPERATIONS*****\n\n");
                    System.out.println("111.ADD ELEMENT at LAST");
                    System.out.println("222.ADD ELEMENT at POSITION");
                    System.out.println("Enter Your Choice");
                    try
                    {
                        choice=Integer.parseInt(br.readLine());
                    }
                    catch(NumberFormatException ne)
                    {
                        System.out.println("Enter Integers Only Sorry");
                    }
                    switch(choice)
                    {
                        case 111:    System.out.println("Enter the Object to ADD");
                                    element=br.readLine();
                                    al.add(element);
                                    System.out.println("ADDED Successfully !");
                                    break;
                        case 222:    System.out.println("Enter the POSITION to ADD");
                                    try{
                                    pos=Integer.parseInt(br.readLine());
                                    System.out.println("Enter the Object to ADD at POSITION");
                                    element=br.readLine();
                                    al.add(pos,element);
                                    System.out.println("ADDED Successfully !");
                                    }
                                    catch(NumberFormatException ne)
                                    {
                                        System.out.println("Enter POSITION in INTEGER only ");
                                        ne.printStackTrace();
                                    }
                                    break;
                        default:    System.out.println("Sorry! Incorrect Choice");
                                    break;


                    }
                    break;

            case 2: System.out.println("\n\n*****ARRAYLIST REMOVE OPERATIONS*****\n\n");
                    System.out.println("21.REMOVE ELEMENT");
                    System.out.println("22.REMOVE ELEMENT at POSITION");
                    System.out.println("Enter Your Choice");
                    try
                    {
                        choice=Integer.parseInt(br.readLine());
                    }
                    catch(NumberFormatException ne)
                    {
                        System.out.println("Enter Integers Only! Sorry");
                    }
                    switch(choice)
                    {
                        case 21:    System.out.println("Enter the Object to REMOVE");
                                    element=br.readLine();
                                    if(al.remove(element))
                                    {
                                        System.out.println("REMOVED Successfully !");
                                    }
                                    else
                                    {
                                        System.out.println("Sorry! Cannot find the Object");
                                    }
                                    break;
                        case 22:    System.out.println("Enter the POSITION to REMOVE");
                                    try{
                                        pos=Integer.parseInt(br.readLine());
                                        al.remove(pos);
                                        System.out.println("REMOVED Successfully !");
                                    }
                                    catch(NumberFormatException ne)
                                    {
                                        System.out.println(ne.getMessage());
                                        System.out.println("Enter INPUT INTEGER ONLY");
                                    }
                                    catch(IndexOutOfBoundsException ie)
                                    {
                                        System.out.println(ie);
                                    }
                                    break;
                        default:    System.out.println("Sorry! Incorrect Choice");
                                    break;
                    }
                    break;

            case 3: if(al.size()>0)
                    {
                    for(int i=0;i<al.size();i++)
                    {
                        System.out.print(al.get(i)+"\t");
                    }
                    }
                    else
                    {
                        System.out.println("ARRAYLIST is EMPTY");
                    }
                    break;

            case 4: System.out.println("Enter The Element to SEARCH");
                    obj=br.readLine();
                    pos=al.indexOf(obj);
                    if(pos==-1)
                    {
                        System.out.println("Element "+obj+" Not Found in the ArrayList");
                    }
                    else
                    {
                        System.out.println("Element "+obj+" Found in the ArrayList at POSITION "+pos);
                    }
                    break;

            case 5: 
                    try{
                        System.out.println("Enter the POSITION for REPLACE");
                        pos=Integer.parseInt(br.readLine());
                        System.out.println("Enter the Object for REPLACE");
                        element=br.readLine();
                        al.set(pos, element);
                        System.out.println("SET Successfully !");
                    }
                    catch(NumberFormatException ne)
                    {
                        ne.printStackTrace();
                        System.out.println("Enter INPUT INTEGER ONLY");
                    }
                    catch(IndexOutOfBoundsException ie)
                    {
                        System.out.println("INDEX didnot MATCH");
                    }
                    break;

            case 6:
                    System.out.println("SIZE or CAPACITY of the ARRAYLIST is "+al.size());
                    break;

            case 7:
                    System.out.println("CLEARING the ARRAYLIST\nPlease Wait....");
                    Thread.sleep(2000);
                    al.clear();
                    System.out.println("CLEARED successfully");
                    break;

            case 8:
                    System.out.println("Enter The OBJECT to CHECK");
                    obj=br.readLine();
                    boolean flag=al.contains(obj);
                    if(flag)
                    {
                        System.out.println("ARRAYLIST CONTAIN the OBJECT "+obj);
                    }
                    else
                    {
                        System.out.println("ARRAY LIST did CONTAIN the OBJECT "+obj);
                    }
                    break;

            case 9:
                    Object oa[]=al.toArray();
                    for(Object o:oa)
                    {
                        System.out.print(o+" ");
                    }
                    break;

            case 10:
                try{
                    System.out.println("Enter the STARTING POS");
                    int first=Integer.parseInt(br.readLine());
                    System.out.println("Enter the LAST POS");
                    int last=Integer.parseInt(br.readLine());
                    List<String>sl=al.subList(first,last);
                    System.out.println("SUBLIST is "+sl);
                    }
                    catch(IndexOutOfBoundsException ie)
                    {
                        System.out.println("INDEX_OUT_OF_BOUNDS_EXCEPTION");
                        ie.printStackTrace();
                    }
                    catch(NumberFormatException ne)
                    {
                        System.out.println(ne.getMessage()+"\nEnter INPUT INTEGER ONLY");
                    } 
                    catch(IllegalArgumentException ie)
                    {
                        System.out.println("ILLEGAL_ARGUMENT_EXCEPTION"); 
                        ie.printStackTrace();
                    }                   
                    break;

            case 11:
                    System.exit(0);
                    break;

            default:
                    System.out.println("Sorry! Invalid Choice\nEnter Your Choice Between(1-10)");
                    break;
        }
    }
 }    
}