import java.util.Scanner;

public class _15_WeekDaysByNum {
    public static void main(String[] args) {
        _15_WeekDaysByNum weekDaysByNum = new _15_WeekDaysByNum();
        weekDaysByNum.Weekdays();
    }

    public void Weekdays()

    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Any Number:  ");

        int daysNumber;

        daysNumber = scanner.nextInt();

        if (daysNumber == 1)

            System.out.println("Monday");

        else if (daysNumber == 2)

            System.out.println("Tuesday");

        else if (daysNumber == 3)

            System.out.println("Wednesday");

        else if (daysNumber == 4)

            System.out.println("Thursday");

        else if (daysNumber == 5)

            System.out.println("Friday");

        else if (daysNumber == 6)

            System.out.println("Saturday");

        else if (daysNumber == 7)

            System.out.println("Sunday");

        else

            System.out.println("Week Days between 1 to 7 only");

    }
}




