import java.io.*;
import java.util.Arrays;


public class sl {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String S = read.readLine();
            Solution1 ob = new Solution1();
            String result = ob.firstAlphabet(S);
            
            System.out.println(result);
        }
    }
}// } Driver Code Ends


//User function Template for Java
/**
class Solution1 {
    String firstAlphabet(String S) {
        String str[]=S.split(" ");

        String res="";
        for(String x:str)
        {
            char ch=x.charAt(0);
            res.concat(Character.toString(ch));
        }
        return res;
        
    }
};

 */
// { Driver Code Starts
//Initial Template for Java

class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            int N = Integer.parseInt(read.readLine());
            Solution ob = new Solution();
            System.out.println(ob.isBitSet(N));
        }
    }
}// } Driver Code Ends


//User function Template for Java
class Solution{
    static int isBitSet(int N){
        String st=Integer.toBinaryString(N);
        st=st.replace("0b","");
        int c=st.indexOf("0");
        
        
       
        if(c==0)
        return 1;
        else
        return 0;

        
        
        
    }
}