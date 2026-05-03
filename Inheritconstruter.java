class Nokia {
    int x, y;

    Nokia() {
        x = 10;
        y = 20;
    }

    void f1() {
        System.out.println("This is the parent class.");
    }
}

class Nokia1 extends Nokia {

    int z;

    Nokia1() {
        super();
        System.out.println("This is the child class." + z);
    }

    void f2() {
        z = x + y;
        System.out.println("Sum is: " + z);
    }
}

public class Inheritconstruter {
    public static void main(String[] args) {
        Nokia1 n1 = new Nokia1();
        n1.f2();
    }
}