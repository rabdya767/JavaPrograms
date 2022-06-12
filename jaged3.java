public class jaged3 
{
    public static void main(String[] args) 
    {
        int x[][][] = new int[4][][];

        x[0] = new int[1][3];
        x[1] = new int[2][2];
        x[2] = new int[4][1];
        x[3] = new int[3][2];

        x[0][0][0] = 111;
        x[0][0][1] = 222;
        x[0][0][2] = 333;

        x[1][0][0] = 100;
        x[1][0][1] = 101;
        x[1][1][0] = 110;
        x[1][1][1] = 111;

        x[2][0][0] = 200;
        x[2][1][0] = 210;
        x[2][2][0] = 220;
        x[2][3][0] = 230;

        x[3][0][0] = 123;
        x[3][0][1] = 456;
        x[3][1][0] = 789;
        x[3][1][1] = 123;
        x[3][2][0] = 456;
        x[3][2][1] = 789;

        for(int i[][]:x)
        {
            for(int j[]:i)
            {
                for(int k:j)
                {
                    System.out.print(k+"\t");
                }
                System.out.println();
            }
            System.out.println("****************************");
        }



/**
        for (int i = 0; i < 1; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(x[0][i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println("***********************");

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(x[1][i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println("***********************");

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 1; j++) {
                System.out.print(x[2][i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println("***********************");

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(x[3][i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println("***********************");
  */
    }
}