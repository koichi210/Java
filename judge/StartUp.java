public class StartUp
{
    public static void main(String args[])
    { 
        enum Week
        {
            SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
        }

        Week week = Week.WEDNESDAY; 

        switch(week)
        {
        case MONDAY:
            System.out.println("月曜日");
            break;

        case TUESDAY:
            System.out.println("火曜日");
            break;

        case WEDNESDAY:
            System.out.println("水曜日");
            break;

        default:
            System.out.println("メンテナンス中");
            break;
        }
    }
}
