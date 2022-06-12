import java.util.*;

public class matsub {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the No.of rows and cols of 1st matrix");
        int r1 = sc.nextInt();
        int c1 = sc.nextInt();
        int mat1[][] = new int[r1][c1];

        System.out.println("Enter the  Elemnts of 1st Matrix?");
        matadd.input(r1, c1, mat1);

        System.out.println("Enter the No.of rows and cols of 2nd matrix");
        int r2 = sc.nextInt();
        int c2 = sc.nextInt();

        if (r1 == r2 & c1 == c2) {
            int mat2[][] = new int[r2][c2];
            int res[][] = new int[r1][c1];

            System.out.println("Enter the  Elemnts of 2nd Matrix?");
            matadd.input(r2, c2, mat2);

            System.out.println("1st Matrix is  ");
            matadd.print(r1, c1, mat1);

            System.out.println("2nd Matrix is  ");
            matadd.print(r2, c2, mat2);

            for (int i = 0; i < r2; i++) {
                for (int j = 0; j < c2; j++) {
                    res[i][j] = mat1[i][j] - mat2[i][j];
                }
            }

            System.out.println("Result of the Matrix is  ");
            matadd.print(r1, c1, res);
        } else {
            System.out.println("Substraction Not Possible with different sizes of the Matrix");
            System.exit(0);
        }
        sc.close();
    }

    public static void print(int a, int b, int ab[][]) {
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                System.out.print(ab[i][j] + "\t");
            }
            System.out.println();
        }
    }
    /**
     * @rabdya 
     * @santhosh
     */

    public static void input(int a, int b, int ab[][]) {
        Scanner sc1 = new Scanner(System.in);
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                ab[i][j] = sc1.nextInt();
            }
        }
        sc1.close();
    }
}