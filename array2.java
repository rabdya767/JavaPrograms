import java.util.Scanner;

public class array2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the No.of rows and cols?");
        int r = sc.nextInt();
        int c = sc.nextInt();
        int arr[][] = new int[r][c];
        System.out.println("Enter the array Elemnts?");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        for(int i[]:arr)
        {
            for(int j:i)
            {
                System.out.printf("%02d\t",j);
            }
            System.out.println();
        }
        /**
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
         */
        sc.close();

    }
}