class Nokia {
    int mic;
    int camera;
    int battery;

    void display() {
        System.out.println("This is the parent class.");
    }
}

class Nokia1 extends Nokia {

    
    void display1() {
        System.out.println("This is the child class.");
    }
}

public class Inhrit {
    public static void main(String[] args) {
        Nokia1 n1 = new Nokia1();
        n1.display1();
    }
}