public class varargs3
{
    static void show(String ... X)
    {
        for(String s:X)
        {
            System.out.print(s+"\t");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        String x[]={"RABDYA","RAJU","RAVI"};
        show(new String []{"ABCD","EFGH","IJKL","GDH"});
        show(x);
        show("AZ","BY","CX","DW");
    }
}