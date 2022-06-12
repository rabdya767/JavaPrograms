import java.util.*;
import java.io.*;
import java.lang.Integer;

public class VCTR {
    public static void main(String[] args)
            throws IOException, InterruptedException, IllegalArgumentException, NumberFormatException {
        Vector<String> vc = new Vector<String>();
        vc.add("RCB");
        vc.add("DC");
        vc.add("KKR");
        vc.add("PBKS");
        vc.add("SRH");
        vc.add("CSK");
        vc.add("MI");
        vc.add("RR");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int choice = 0;
        int pos;
        Object obj;
        String element;
        while (true) {
            Thread.sleep(1000);
            System.out.println("\n\n*****VECTOR OPERATIONS*****\n\n");
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

            try {
                choice = Integer.parseInt(br.readLine());
            } catch (NumberFormatException ne) {
                System.out.println("Enter Integers Only");
            }

            switch (choice) {
            case 1:
                System.out.println("\n\n*****VECTOR ADD OPERATIONS*****\n\n");
                System.out.println("111.ADD ELEMENT at LAST");
                System.out.println("112.ADD ELEMENT at POSITION");
                System.out.println("Enter Your Choice");
                try {
                    choice = Integer.parseInt(br.readLine());
                } catch (NumberFormatException ne) {
                    System.out.println("Enter Integers Only Sorry");
                }
                switch (choice) {
                case 111:
                    System.out.println("Enter the Object to ADD");
                    element = br.readLine();
                    vc.add(element);
                    System.out.println("ADDED Successfully !");
                    break;
                case 112:
                    System.out.println("Enter the POSITION to ADD");
                    try {
                        pos = Integer.parseInt(br.readLine());
                        System.out.println("Enter the Object to ADD at POSITION");
                        element = br.readLine();
                        vc.add(pos, element);
                        System.out.println("ADDED Successfully !");
                    } catch (NumberFormatException ne) {
                        System.out.println("Enter POSITION in INTEGER only ");
                        ne.printStackTrace();
                    }
                    break;
                default:
                    System.out.println("Sorry! Incorrect Choice");
                    break;

                }
                break;

            case 2:
                System.out.println("\n\n*****VECTOR REMOVE OPERATIONS*****\n\n");
                System.out.println("221.REMOVE ELEMENT");
                System.out.println("222.REMOVE ELEMENT at POSITION");
                System.out.println("Enter Your Choice");
                try {
                    choice = Integer.parseInt(br.readLine());
                } catch (NumberFormatException ne) {
                    System.out.println("Enter Integers Only! Sorry");
                }
                switch (choice) {
                case 221:
                    System.out.println("Enter the Object to REMOVE");
                    element = br.readLine();
                    if (vc.remove(element)) {
                        System.out.println("REMOVED Successfully !");
                    } else {
                        System.out.println("Sorry! Cannot find the Object");
                    }
                    break;
                case 222:
                    System.out.println("Enter the POSITION to REMOVE");
                    try {
                        pos = Integer.parseInt(br.readLine());
                        vc.remove(pos);
                        System.out.println("REMOVED Successfully !");
                    } catch (NumberFormatException ne) {
                        System.out.println(ne.getMessage());
                        System.out.println("Enter INPUT INTEGER ONLY");
                    } catch (IndexOutOfBoundsException ie) {
                        System.out.println(ie);
                    }
                    break;
                default:
                    System.out.println("Sorry! Incorrect Choice");
                    break;
                }
                break;

            case 3:
                System.out.println("\n\n*****VECTOR DISPLAY OPERATIONS USING*****\n\n");
                System.out.println("331.FOR-EACH LOOP");
                System.out.println("332.ITERATOR");
                System.out.println("333.LISTITERATOR");
                System.out.println("334.ENUMERATION");
                System.out.println("Enter Your Choice");
                try {
                    choice = Integer.parseInt(br.readLine());
                } catch (NumberFormatException ne) {
                    System.out.println("Enter Integers Only! Sorry");
                }
                switch (choice) {
                case 331:
                    System.out.println("USING FOR-EACH LOOP");
                    if (vc.size() > 0) {
                        for (int i = 0; i < vc.size(); i++) {
                            System.out.print(vc.get(i) + "\t");
                        }
                    } else {
                        System.out.println("VECTOR is EMPTY");
                    }
                    break;
                case 332:
                    System.out.println("USING ITERATOR");
                    Iterator<String> it = vc.iterator();

                    while (it.hasNext()) {
                        System.out.print(it.next() + "\t");
                    }
                    break;

                case 333:
                    System.out.println("USING LIST ITERATOR");
                    ListIterator<String> lit = vc.listIterator();
                    System.out.println("In FORWARD DIRECTION");

                    while (lit.hasNext()) {
                        System.out.print(lit.next() + "\t");
                    }

                    System.out.println("\nIn BACKWARD DIRECTION");

                    while (lit.hasPrevious()) {
                        System.out.print(lit.previous() + "\t");
                    }
                    break;

                case 334:
                    Enumeration<String>en=Collections.enumeration(vc);
                    System.out.println("USING ENUMERATION");
                    while(en.hasMoreElements())
                    {
                        System.out.print(en.nextElement()+"\t");
                    }

                    System.out.println();
                    break;
                default:
                    System.out.println("Invalid Choice");
                    break;
                }
                break;
            case 4:
                System.out.println("Enter The Element to SEARCH");
                obj = br.readLine();
                pos = vc.indexOf(obj);
                if (pos == -1) {
                    System.out.println("Element " + obj + " Not Found in the VECTOR");
                } else {
                    System.out.println("Element " + obj + " Found in the VECTOR at POSITION " + pos);
                }
                break;

            case 5:
                try {
                    System.out.println("Enter the POSITION for REPLACE");
                    pos = Integer.parseInt(br.readLine());
                    System.out.println("Enter the Object for REPLACE");
                    element = br.readLine();
                    vc.set(pos, element);
                    System.out.println("SET Successfully !");
                } catch (NumberFormatException ne) {
                    ne.printStackTrace();
                    System.out.println("Enter INPUT INTEGER ONLY");
                } catch (IndexOutOfBoundsException ie) {
                    System.out.println("INDEX didnot MATCH");
                }
                break;

            case 6:
                System.out.println("SIZE or CAPACITY of the VECTOR is " + vc.size());
                break;

            case 7:
                System.out.println("CLEARING the VECTOR\nPlease Wait....");
                Thread.sleep(2000);
                vc.clear();
                System.out.println("CLEARED successfully");
                break;

            case 8:
                System.out.println("Enter The OBJECT to CHECK");
                obj = br.readLine();
                boolean flag = vc.contains(obj);
                if (flag) {
                    System.out.println("VECTOR CONTAIN the OBJECT " + obj);
                } else {
                    System.out.println("VECTOR did CONTAIN the OBJECT " + obj);
                }
                break;

            case 9:
                Object oa[] = vc.toArray();
                for (Object o : oa) {
                    System.out.print(o + " ");
                }
                break;

            case 10:
                try {
                    System.out.println("Enter the STARTING POS");
                    int first = Integer.parseInt(br.readLine());
                    System.out.println("Enter the LAST POS");
                    int last = Integer.parseInt(br.readLine());
                    List<String> sl = vc.subList(first, last);
                    System.out.println("SUBLIST is " + sl);
                } catch (IndexOutOfBoundsException ie) {
                    System.out.println("INDEX_OUT_OF_BOUNDS_EXCEPTION");
                    ie.printStackTrace();
                } catch (NumberFormatException ne) {
                    System.out.println(ne.getMessage() + "\nEnter INPUT INTEGER ONLY");
                } catch (IllegalArgumentException ie) {
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

/**
 * 
 * 
 * if (vc.size() > 0) { for (int i = 0; i < vc.size(); i++) {
 * System.out.print(vc.get(i) + "\t"); } } else { System.out.println("VECTOR is
 * EMPTY"); }
 */