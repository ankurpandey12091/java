class ankur
{
protected int x;
protected int y;
void setData(int x, int y)
{
    this.x = x;
    this.y = y;
}
}

class ankur1 extends ankur
{
void display()
{
    System.out.println(x);
    System.out.println(y);
}
}

class This {
    public static void main(String[] args) {
       
        System.out.println("This is a test class to demonstrate the use of 'this' keyword.");
    
    
        ankur1 a1 = new ankur1();
        a1.setData(10, 20);
        a1.display();
    }
}