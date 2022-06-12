import java.util.*;

public class infix_conversion 
{

    public static void main(String args[]) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Infix Expression");
        String exp = sc.nextLine();
        Stack<String> post = new Stack<>();
        Stack<String> pre = new Stack<>();
        Stack<Character> operandstack = new Stack<>();
        sc.close();

        for (int i = 0; i < exp.length(); i++) 
        {
            char ch = exp.charAt(i);
            if (ch == '(') 
            {
                operandstack.push(ch);
            }
            else if ((ch >= '0' && ch <= '9') || (ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) 
            {
                post.push(ch+"");
                pre.push(ch + "");
            }
            else if (ch == ')') 
            {
                while (operandstack.peek() != '(') 
                {
                    char op = operandstack.pop();
                    String postv2 = post.pop();
                    String postv1 = post.pop();
                    String postv = postv1 + postv2 + op;
                    post.push(postv);

                    String prev2 = pre.pop();
                    String prev1 = pre.pop();
                    String prev = op + prev1 + prev2;
                    pre.push(prev);

                }
                operandstack.pop();
            } 
            else if (ch == '+' || ch == '-' || ch == '*' || ch == '/') 
            {

                while (operandstack.size() > 0 && operandstack.peek() != '(' && precedence(ch) <= precedence(operandstack.peek())) {
                    char op = operandstack.pop();
                    String postv2 = post.pop();
                    String postv1 = post.pop();
                    String postv = postv1 + postv2 + op;
                    post.push(postv);

                    String prev2 = pre.pop();
                    String prev1 = pre.pop();
                    String prev = op + prev1 + prev2;
                    pre.push(prev);

                }
                operandstack.push(ch);
            }
        }

        while (operandstack.size() != 0) {
            char op = operandstack.pop();
            String postv2 = post.pop();
            String postv1 = post.pop();
            String postv = postv1 + postv2 + op;
            post.push(postv);

            String prev2 = pre.pop();
            String prev1 = pre.pop();
            String prev = op + prev1 + prev2;
            pre.push(prev);

        }

        System.out.println("postfix==> " + post.pop());
        System.out.println("Prefix==> " + pre.pop());
    }

    public static int precedence(char op) {
        if (op == '+') {
            return 1;
        }

        else if (op == '-') {
            return 1;
        } else if (op == '/') {
            return 2;
        } else if (op == '*') {
            return 2;
        }

        return 2;
    }
}