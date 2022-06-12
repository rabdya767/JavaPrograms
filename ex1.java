import java.io.*;

class ex1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
            int n = Integer.parseInt(br.readLine().trim());
            String[] str = br.readLine().trim().split(" ");
            int[] array = new int[n];
            for (int i = 0; i < n - 1; i++)
            {
                array[i] = Integer.parseInt(str[i]);
            }
            for(int j=0;j<n;j++)
            {
                System.err.println(array[j]);
            }
        }
    }