import java.util.Calendar;

public class Sample
{
    Calendar date = Calendar.getInstance();
    Action signal = null;
    String greeting = "Hello";
    char ch = "A";
    int value = 123;
    double dbl = 12.345;
    boolean flg = true;
    enum Action {BLUE, YELLOW, RED};
}

public class StartUp
{
    public static void main(String args[])
    { 
        Sample smp = new Sample();
		System.out.print(smp.greeting)
    }
}
