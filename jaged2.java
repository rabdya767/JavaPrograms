public class jaged2 {
    public static void main(String[] args) {
        int x[][] = new int[5][];

        x[0] = new int[4];
        x[1] = new int[2];
        x[2] = new int[5];
        x[3] = new int[1];
        x[4] = new int[3];

        x[0][0] = 10;
        x[0][1] = 20;
        x[0][2] = 30;
        x[0][3] = 40;

        x[1][0] = 25;
        x[1][1] = 75;

        x[2][0] = 11;
        x[2][1] = 22;
        x[2][2] = 33;
        x[2][3] = 44;
        x[2][4] = 55;

        x[3][0] = 30;

        x[4][0] = 12;
        x[4][1] = 23;
        x[4][2] = 34;

        for (int k[] : x) {
            for (int i : k) {
                System.out.print(i + "\t");
            }
            System.out.println();
        }
        /**
         * for (int i : x[0]) { System.out.print(i + "\t"); }
         * 
         * System.out.println();
         * 
         * for (int j : x[1]) { System.out.print(j + "\t"); }
         * 
         * System.out.println();
         * 
         * for (int i : x[2]) { System.out.print(i + "\t"); }
         * 
         * System.out.println();
         * 
         * for (int j : x[3]) { System.out.print(j + "\t"); }
         * 
         * System.out.println();
         * 
         * for (int j : x[4]) { System.out.print(j + "\t"); }
         * 
         */
    }
}