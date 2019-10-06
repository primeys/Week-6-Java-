import java.util.Scanner;

public class _2_LeapYear {

    public static void main(String[] args)
    {

        _2_LeapYear leapYear = new _2_LeapYear();
        leapYear.LeapYr();

    }

    public void LeapYr() {

        int year;

        System.out.println("Enter year  = ");

        Scanner scanner = new Scanner(System.in);
        year = scanner.nextInt();

        if ((year %4 ==0) && (year %100!=0)){
            System.out.println(" Enter year is Leap year :");
        }
        else if (year % 400 == 0) {
            System.out.println("Enter year is Leap year : ");
            }
        else if ((year %100 ==0)&& (year%400==0))
        {
            System.out.println("Enter year is Leap year :");
        }
        else {
            System.out.println("Enter yer is not leap year :");
        }

    }


}
