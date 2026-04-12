public class wrapper {
    public static void main(String[] args) {
        int x=Integer.parseInt("23224");
        Integer i=Integer.valueOf("23224");
        int y=i.intValue();
        System.out.println(x);
        System.out.println(i);
        System.out.println(y);
    }
}
