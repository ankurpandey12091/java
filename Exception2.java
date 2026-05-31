import java.io.*;

class Exception2
{
    public static void main(String[] args)
    {
        System.out.println("A");

        try
        {
            throw new IOException("Printer not found");
        }
        catch(IOException e1)
        {
            System.out.println(e1.getMessage());
        }
    }
}