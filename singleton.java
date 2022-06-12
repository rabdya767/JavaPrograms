@SuppressWarnings("")
class coffee
{
    private float sugar;
    private float milk;
    private float water;
    private float coffeepwdrqty;
    static private coffee myobj=null;

    private coffee()
    {
        sugar=1;
        milk=1;
        water=1;
        coffeepwdrqty=1;
    }

    public void fillwater(float water)
    {
        this.water=water;
    }
    public void fillsugar(float sugar)
    {
        this.sugar=sugar;
    }

    public void fillmilk(float milk)
    {
        this.milk=milk;
    }

    static coffee getInstance()
    {
        if(myobj==null)
            myobj=new coffee();
        return myobj;
    }

    public void Mix()
    {
        System.out.println(sugar+"\n"+milk+"\n"+water+"\n"+coffeepwdrqty);
    }
}


public class singleton {
    public static void main(String[] args) {
        coffee m1=coffee.getInstance();
        coffee m2=coffee.getInstance();
        coffee m3=coffee.getInstance();
        System.out.println(m1+" "+m2+" "+m3);

        if(m1==m2 && m2==m3 && m3==m1)
        {
            System.out.println("Same");
        }
        m1.Mix();
    }
}