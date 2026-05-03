class Demo {
    int x, y;

    // Constructor
    Demo() {
        x = 5;
        y = 6;
    }
}

public class Constructor {
    public static void main(String[] args) {
        Demo a1 = new Demo();   // correct object creation

        System.out.println(a1.x);
        System.out.println(a1.y);
    }
}

