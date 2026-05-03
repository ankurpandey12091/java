class Demo {
    int x;
    int y;

    // Parameterized Constructor
    Demo(int a, int b) {
        x = a;
        y = b;
    }
}

public class Parameterconx {
    public static void main(String[] args) {
        Demo d = new Demo(10, 20);

        System.out.println(d.x);
        System.out.println(d.y);
    }
}