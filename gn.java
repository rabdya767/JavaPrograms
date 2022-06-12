import java.lang.Integer;

class data<T>
{
    private T obj;

    public void setData(T v)
    {
        obj=v;
    }

    public T getData()
    {
        return obj;
    }
}

public class gn
{
    public static void main(String[] args) {
        data<Integer>dt=new data<>();

        dt.setData(12);
        System.out.println(dt.getData());

        dt.setData(13);
        System.out.println(dt.getData());
    }
}