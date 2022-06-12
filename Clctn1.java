import java.io.*;
import java.lang.Integer;

class Emp {
    String name;
    int id;

    Emp(int id, String name) {
        this.id = id;
        this.name = name;
    }

    protected void DisplayData() {
        System.out.println(id + "\t" + name);
    }

}

public class Clctn1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the No.of Objects");
        int n = Integer.parseInt(br.readLine());
        Emp array[] = new Emp[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter Id of Emp" + (i + 1));
            int id = Integer.parseInt(br.readLine());
            System.out.println("Enter Name of Emp" + (i + 1));
            String name = br.readLine();
            array[i] = new Emp(id, name);
        }

        System.out.println("id" + "\t" + "Name");

        for (int i = 0; i < n; i++) {
            array[i].DisplayData();
        }

    }
}