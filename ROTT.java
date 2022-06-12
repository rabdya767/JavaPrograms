class One11 {
    Two2 obj2;

    One11(Two2 obj2) {
        this.obj2 = obj2;
    }

    double cube(double x) {
        double result = x * obj2.square(x);
        return result;
    }

}

class Two2 {
    Three3 obj3;

    Two2(Three3 obj3) {
        this.obj3 = obj3;
    }

    double square(double x) {
        double result = x * obj3.get(x);
        return result;
    }
}

class Three3 {
    double get(double x) {
        return x;
    }
}

public class ROTT {
    public static void main(String[] args) {
        //Three3 obj3 = new Three3();
        //Two2 obj2 = new Two2(obj3);
        //One11 obj1 = new One11(obj2);
        Three3 obj3=new Three3();
        Two2 obj2=new Two2(new Three3());
        One11 obj1 = new One11(new Two2(new Three3()));
        double res1,res2,res3;
        res1 = obj1.cube(5);
        res2 = obj2.square(5);
        res3=obj3.get(5);
        System.out.println("The value  Of x  is " + res3);
        System.out.println("Cube Of " + 5 + " is " + res1);
        System.out.println("Square Of " + 5 + " is " + res2);
    }
}