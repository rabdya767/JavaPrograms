public class rndm {
 public static void main(String[] args) throws InterruptedException{

    int count=0;
    System.out.println("Random Numbers BetWeen 0 to 10: ");
    while(true)
    {
    
        double d=10*Math.random();
        int i=(int)d;
        System.out.println(i);
        count+=1;
        Thread.sleep(2000);
        if(i==0)
        {
            System.out.println("Count "+count);
            System.exit(0);
        }
    }
 }   
}