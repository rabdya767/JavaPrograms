public class array22 {
    public static void main(String[] args) {

        int array[][] = { { 11, 4, 17 }, { 17, 15, 9 }, { 8, 15, 16 } };
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();

        }
    }
}