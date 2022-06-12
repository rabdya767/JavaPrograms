import java.util.*;
import java.lang.Integer;
import java.io.*;

public class LLSTR 
{
public static void main(String[] args) throws InterruptedException,IOException,NumberFormatException
{
    LinkedList<String>ll=new LinkedList<String>();
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int choice = 0;
    String element;
    while(true)
    {
        System.out.println("\n\n*****LINKEDLIST OPERATIONS*****\n\n");
        System.out.println("1.ADD");
        System.out.println("2.REMOVE");
        System.out.println("3.DISPLAY");
        System.out.println("4.SEARCH");
        System.out.println("5.CAPACITY");
        System.out.println("6.CLEAR");
        System.out.println("7.EXIT");
        System.out.println("Enter Your Choice");
        try{
                choice = Integer.parseInt(br.readLine());
        }catch(NumberFormatException nfe)
        {
                System.out.println("Enter only Integer");
        }
        switch(choice)
        {
            case 1: System.out.println("Enter The String ");
                    ll.add(br.readLine());
                    System.out.println("Added Successfully");
                    break;

            case 2: 
                    try
                    {
                    System.out.println("Removed Element is "+ll.remove());
                    }
                    catch(NoSuchElementException nsec)
                    {
                            nsec.printStackTrace();
                    }
                    break;
            case 3: 
                    ////for(String s:ll)
                    ////{
                    ////    System.out.print(s+"\t");
                    ////}
                    ////System.out.println();
                    try
                    {
                    for(int i=0;i<ll.size()-1;i++)
                    {
                            System.out.print(ll.get(i)+" ---> ");
                    }
                    System.out.println(ll.get(ll.size()-1));
                    }
                    catch(IndexOutOfBoundsException ie)
                    {
                            //ie.printStackTrace();
                            System.out.println("LL is Empty []");
                    }
                    break;
            case 4: System.out.println("Enter The String ");
                    element=br.readLine();
                    int pos=ll.indexOf(element);
                    if(pos==-1)
                    {    
                        System.out.println("String "+element+" Not Found");
                    }
                    else
                    {
                        System.out.println("String "+element+" Found At position"+pos);
                    }
                    break;

            case 5: System.out.println("Size of LL is "+ll.size());
                    break;
            case 6: System.out.println("Clearing the LL");
                    ll.clear();
                    Thread.sleep(2000);
                    System.out.println("Done");
                    break;
            
            case 7:
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