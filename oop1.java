class Person {
    String Name;
    int Age;

    void talk() {
        System.out.println("Name is " + Name);
        System.out.println("Age is " + Age);
    }
}

class oop1 {
    public static void main(String[] args) {
        Person Raju = new Person();
        Raju.talk();
    }
}