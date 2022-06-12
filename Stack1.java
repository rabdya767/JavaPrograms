import java.util.*;
import java.lang.Integer;
import java.io.*;

public class Stack1 {
    public static void main(String[] args) throws IOException, InterruptedException {
        Stack<Integer> stk = new Stack<Integer>();
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int choice = 0;
        int element, position;
        Integer obj;
        while (choice != 8) {
            System.out.println("*****STACK OPERATIONS*****");
            System.out.println("1.PUSH");
            System.out.println("2.POP");
            System.out.println("3.DISPLAY");
            System.out.println("4.SEARCH");
            System.out.println("5.PEEK");
            System.out.println("6.CAPACITY");
            System.out.println("7.CLEAR");
            System.out.println("8.EXIT");
            System.out.println("Enter Your Choice");
            choice = Integer.parseInt(br.readLine());

            switch (choice) {

            case 1:
                System.out.println("Enter the Element to PUSH");
                element = Integer.parseInt(br.readLine());
                stk.push(element);
                System.out.println("Inserted Successfully");
                System.out.println("STACK after this operation \n" + stk);
                break;

            case 2:
                try {
                    obj = stk.pop();
                    System.out.println("Popped element is " + obj);
                System.out.println("STACK after this operation \n" + stk);
                } catch (EmptyStackException ese) {
                    System.out.println(ese);
                }
                break;

            case 3:
                for (int i : stk) {
                    System.out.print(i + "\t");
                }
                System.out.println();
                break;
            case 4:
                System.out.println("Enter the Element to SEARCH");
                element = Integer.parseInt(br.readLine());
                position = stk.search(element);

                if (position == -1) {
                    System.out.println("Element Not Found");
                } else {
                    System.out.println("Element " + element + " Found at Position" + position);
                }
                break;

            case 5:
                try {
                    obj = stk.peek();
                    System.out.println("PEEK element is " + obj);
                } catch (EmptyStackException ese) {
                    ese.printStackTrace();
                }
                break;

            case 6:
                element = stk.capacity();
                System.out.println("STACK Capacity is " + element);
                break;

            case 7:
                System.out.println("Clearing the STACK...");
                stk.clear();
                Thread.sleep(1000);
                System.out.println("Cleared Successfully");
                System.out.println("STACK after this operation \n" + stk);
                break;

            case 8:
                System.exit(0);
                break;

            default:
                System.out.println("Sorry! Invalid Choice");
                System.out.println("Enter Your Choice Between(1-8)");
                break;

            }
        }

    }
}