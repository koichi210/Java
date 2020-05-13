public class StartUp
{
    public static void main(String args[])
    { 
        try
        {
            int val = 10 / 0;
        } catch (ArithmeticException e)
        {
            System.out.println("divide by zero.");
        } 
    }
}
