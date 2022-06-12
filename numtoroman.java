public class numtoroman
{
    public static void main(String args[])
    {
        int num=19;
        String res="";
        String th[]={"","M","MM","MMM"};
        String hn[]={"","C","CC","CCC","CD","D","DC","DCC","DCCC","CM"};
        String tn[]={"","X","XX","XXX","XL","L","LX","LXX","LXXX","XC"};
        String on[]={"","I","II","III","IV","V","VI","VII","VIII","IX"};

        res+=th[num/1000]+hn[(num%1000)/100]+(tn[(num%100)/10])+(on[num%10]);
        System.out.println(res);
    }
}