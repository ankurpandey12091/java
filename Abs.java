abstract class ankur{
    int x,y;
    void f1()
    {
        x=1;
        y=2;

    }
    abstract void f2();
    ankur()
    {
        System.out.println("This is the parent class.");
    }
}
class ankur1 extends ankur
{
    int z;
    void f2()
    {
        System.out.println("Abstract method f2 implemented in child class.");
    }
    void f3()
    {
        z=x+y;
        System.out.println("Sum is: "+z);
    }
    ankur1()
    {
        super();
        System.out.println("This is the child class.");
        }
}


class Abs {
    public static void main(String[] args) {
        ankur1 a1 = new ankur1();
        a1.f1();
        a1.f3();
        a1.f2();
    }
        
    
}
