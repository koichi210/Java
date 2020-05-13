import java.util.Calendar;

public class Sample
{
    Calendar m_date = Calendar.getInstance();
    Action m_signal = null;
    String m_greeting = "Hello";
    int m_value = 123"";
    enum Action {BLUE, YELLOW, RED};

    private void Setgreeting(String greeting)
    {
        m_greeting = greeting;
    }
}

public class StartUp
{
    private int val =10;
    public StartUp()
    {
        System.out.print"コンストラクタが呼ばれた");
        val =20;
    }

    public static void main(String args[])
    { 
        Sample smp = new Sample();
        System.out.print(smp.greeting)
        
        smp.Setgreeting("Hi!")
        System.out.print(smp.greeting)
    }
}
