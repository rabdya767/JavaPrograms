import java.io.BufferedReader;

import java.io.*;

public class swapevenoddbits {
 public static void main(String args[]) throws Exception
 {
     BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
     System.out.println("Enter number ? ");
     int n=Integer.parseInt(br.readLine());

     int even=n&0b01010101;
     int odd=n&0b10101010;
     even=even<<1;
     odd=odd>>1;
     int res=even|odd;
     System.out.println(res);

 }   
}
