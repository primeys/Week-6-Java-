import java.util.Scanner;

public class _7_AvgFiveNum
{

    public static void main (String[]args)
    {
        _7_AvgFiveNum avgFiveNum = new _7_AvgFiveNum();
        avgFiveNum.AverageNumber();
    }

    public void AverageNumber()
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your 1st number");
        int no1 = scanner.nextInt();
        System.out.println("Enter your 2nd number");
        int no2 = scanner.nextInt();
        System.out.println("Enter your 3rd number");
        int no3= scanner.nextInt();
        System.out.println("Enter your 4th number");
        int no4 = scanner.nextInt();
        System.out.println("Enter your 5th number");
        int no5 = scanner.nextInt();

        System.out.println(" Total Five numbers average is :" + (no1+no2+no3+no4+no5)/5);


    }

}
