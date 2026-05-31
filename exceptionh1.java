class ExceptionH1 {

    public static void main(String[] args) {

        String s1 = null;

       
        try {
            System.out.println(s1.length());
        }

        catch (NullPointerException n1) {

            System.out.println(n1.getMessage());
        }

       
        try {

            System.out.println(5 / 0);
        }

        catch (ArithmeticException c1) {

            System.out.println(c1.getMessage());
        }

        System.out.println("A");
    }
}