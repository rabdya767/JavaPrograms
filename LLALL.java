import java.util.*;
import java.lang.Integer;
import java.io.*;

public class LLALL 
{

public static void main(String[] args) throws InterruptedException,IOException,NumberFormatException,IllegalArgumentException
{
    LinkedList<String>ll=new LinkedList<String>();
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int choice = 0;
    int pos,index;
    String Object;
    
    ll.add("RCB");
    ll.add("DC");
    ll.add("KKR");
    ll.add("PBKS");
    ll.add("SRH");
    ll.add("CSK");
    ll.add("MI");
    ll.add("RR");

    while(true)
    {
        System.out.println("\n\n*****LINKEDLIST OPERATIONS*****\n\n");
        System.out.println("1.ADD");
        System.out.println("2.REMOVE");
        System.out.println("3.DISPLAY");
        System.out.println("4.SEARCH");
        System.out.println("5.CAPACITY");
        System.out.println("6.CLEAR");
        System.out.println("7.TO ARRAY");
        System.out.println("8.EXIT");
        System.out.println("Enter Your Choice");

        try
        {
                choice = Integer.parseInt(br.readLine());
        }
        catch(NumberFormatException nfe)
        {
                System.out.println("Enter only Integer");
        }

        switch(choice)
        {
            case 1: System.out.println("\n\n*****LINKEDLIST ADD OPERATION*****\n\n");
                    System.out.println("11.ADD");
                    System.out.println("12.ADD FIRST");
                    System.out.println("13.ADD LAST");
                    System.out.println("14.ADD AT INDEX");
                    System.out.println("Enter Your Choice");
                    try
                    {
                        choice = Integer.parseInt(br.readLine());
                    }
                    catch(NumberFormatException nfe)
                    {
                        System.out.println("Enter only Integer");
                    }

                    switch(choice)
                    {
                        case 11:  System.out.println("Enter the Object to ADD");
                                  ll.add(br.readLine());
                                  System.out.println("Added Successfully");
                                  break;

                        case 12:
                                  System.out.println("Enter the Object to ADD FIRST");
                                  ll.addFirst(br.readLine());
                                  System.out.println("Added First Successfully");
                                  break;

                        case 13:
                                  System.out.println("Enter the Object to ADD LAST");
                                  ll.addLast(br.readLine());
                                  System.out.println("Added Successfully");
                                  break;

                        case 14:  
                                  try
                                    {
                                        System.out.println("Enter the INDEX");
                                        index=Integer.parseInt(br.readLine());
                                        System.out.println("Enter the OBJECT");
                                        Object=br.readLine();
                                        ll.add(index, Object);
                                    }
                                  catch(IndexOutOfBoundsException ie)
                                    {
                                        System.out.println(ie);
                                        System.out.println("Cannot INSERT at INDEX ");
                                    }                                     
                                    break;

                        default:  System.out.println("Sorry! Invalid Choice");
                                  System.out.println("Enter Correct Choice");
                                  break;
                    }
                        break;

            case 2: System.out.println("\n\n*****LINKEDLIST REMOVE OPERATIONS*****\n\n");
                    System.out.println("21.REMOVE");
                    System.out.println("22.REMOVE FIRST");
                    System.out.println("23.REMOVE LAST");
                    System.out.println("24.REMOVE at INDEX");
                    System.out.println("25.REMOVE the OBJECT");
                    System.out.println("26.REMOVE FIRST OCCURANCE");
                    System.out.println("27.REMOVE LAST OCCURANCE");
                    System.out.println("Enter Your Choice");
                    try
                    {
                        choice = Integer.parseInt(br.readLine());
                    }
                    catch(NumberFormatException nfe)
                    {
                        System.out.println("Enter only Integer");
                    }
                    
                    try
                    {
                    switch(choice)
                    {
                        case 21:  ll.remove();
                                  System.out.println("REMOVED Successfully");
                                  break;

                        case 22:
                                  ll.removeFirst();
                                  System.out.println("REMOVED FIRST Object Successfully");
                                  break;

                        case 23:
                                  ll.removeLast();
                                  System.out.println("REMOVED LAST Object Successfully");
                                  break;

                        case 24:  System.out.println("Enter the INDEX to REMOVE");
                                  pos=Integer.parseInt(br.readLine());
                                  ll.remove(pos);
                                  System.out.println("REMOVED at INDEX "+pos+" Successfully");
                                  break;

                        case 25:  System.out.println("Enter the OBJCET to REMOVE");
                                  Object=br.readLine();
                                  ll.remove(Object);
                                  System.out.println("REMOVED the Object "+Object+" Successfully");
                                  break;

                        case 26: System.out.println("Enter the OBJCET to REMOVE FIRST OCCURANCE ");
                                 Object=br.readLine();
                                 ll.removeFirstOccurrence(Object);
                                 System.out.println("REMOVE FIRST OCCURANCE SUCCESSFULLY");
                                 break;

                        case 27: System.out.println("Enter the OBJCET to REMOVE LAST OCCURANCE ");
                                 Object=br.readLine();
                                 ll.removeLastOccurrence(Object);
                                 System.out.println("REMOVE LAST OCCURANCE SUCCESSFULLY");
                                 break;

                        default:  System.out.println("Sorry! Invalid Choice");
                                  System.out.println("Enter Correct Choice");
                                  break;
                    }
                }
                    catch(NoSuchElementException nsec)
                    {
                            nsec.printStackTrace();
                    }
                    catch(IndexOutOfBoundsException ie)
                    {
                           ie.printStackTrace();
                    }
                    break;

            case 3: System.out.println("\n\nLINKED LIST IS\n");
                    try{
                    for(int i=0;i<ll.size()-1;i++)
                    {
                        System.out.print(ll.get(i)+" ---> ");
                    }
                    System.out.println(ll.getLast());
                    }
                    catch(NoSuchElementException ne)
                    {
                        System.out.println("[]\nLinkedList is EMPTY");
                    }
                    break;

            case 4: System.out.println("Enter The Object to SEARCH");
                    Object=br.readLine();
                    pos=ll.indexOf(Object);
                    if(pos==-1)
                    {    
                        System.out.println("Object "+Object+" Not Found");
                    }
                    else
                    {
                        System.out.println("String "+Object+" Found At position"+pos);
                    }
                    break;

            case 5: System.out.println("Size of LL is "+ll.size());
                    break;
                    
            case 6: System.out.println("Clearing the LL");
                    ll.clear();
                    Thread.sleep(1000);
                    System.out.println("Done");
                    break;
            
            case 7:
                    System.out.println("Convertion To Array");
                    Thread.sleep(1000);
                    Object obj[]=ll.toArray();
                    System.out.println("Done...\nArray Elements are ");
                    for(Object o:obj)
                    {
                        System.out.print(o+"  ");
                    }
                    System.out.println();
                    break;
            
            case 8:
                    System.exit(0);
                    break;
    
            default:
                    System.out.println("Sorry! Invalid Choice");
                    System.out.println("Enter Your Choice Between(1-7)");
                    break;
        }

    }
}   
}