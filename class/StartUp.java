import java.util.Calendar;

public class Sample
{
    Calendar date = Calendar.getInstance();
    Action signal = null;
    String greeting = "Hello";
    int value = 123"";
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
