interface I2
{
    int x = 6;

    void f1();

    static void f2()
    {
        System.out.println(x);
    }
}

interface I1 extends I2
{
    int y = 10;

    void f3();
}

class C1 implements I1
{
    public void f1()
    {
        System.out.println("Method f1()");
    }

    public void f3()
    {
        System.out.println("Method f3()");
    }
}

public class INTERF
{
    public static void main(String[] args)
    {
        C1 c1 = new C1();

        c1.f1();
        c1.f3();

        System.out.println(c1.y);

        I2.f2();
    }
}