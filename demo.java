class Demo {
    private static int x;

    static void f1() {
        x = 10;
        System.out.println(x);
    }
}

class Program {
    public static void main(String[] args) {
        Demo.f1();   // no object needed
    }
}