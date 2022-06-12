import java.util.*;

public class transpose {
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
        System.out.println("Original Matrix is  ");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
        sc.close();
        // Transpose
        System.out.println("Transpose Matrix  is ");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(arr[j][i] + "\t");
            }
            System.out.println();
        }
    }
}