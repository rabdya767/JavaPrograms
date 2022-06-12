public class jagedar1 {
    public static void main(String[] args) 
    {
        int x[][] = new int[2][];

        x[0] = new int[3];
        x[1] = new int[2];
    

        x[0][0] = 10;
        x[0][1] = 12;
        x[0][2] = 14;

        x[1][0] = 20;
        x[1][1] = 25;
/** 
        for(int i[]:x)
        {
            for(int j:i)
            {
                System.out.print(j+"\t");
            }
            System.out.println("\n**********************");
        }

*/

        for (int i : x[0]) 
        {
            System.out.print(i + "\t");
        }

        System.out.println();

        for (int j : x[1]) 
        {
            System.out.print(j + "\t");
        }

    }
}