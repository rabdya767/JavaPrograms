import java.lang.Integer;

class myarray<T> {

    @SuppressWarnings("unchecked")
    T A[] = (T[]) new Object[10];
    int length = 0;

    public void append(T v) {
        A[length++] = v;
    }

    public void display() {
        /**for(T x:A)
        {
            System.out.print(x+" ");
        }
        */
        for (int i = 0; i < length; i++) {
            System.out.print(A[i] + " ");
        }
         
    }
}

public class gn1 {
    public static void main(String[] args) {
        myarray<Integer> ma = new myarray<>();
        ma.append(12);
        ma.append(13);
        ma.append(18);
        ma.append(10);
        ma.append(98);
        ma.display();
    }
}