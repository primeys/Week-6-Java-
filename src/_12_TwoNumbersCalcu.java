import java.util.Scanner;

public class _12_TwoNumbersCalcu
{
    public static void main(String[] args)
    {

        _12_TwoNumbersCalcu twoNumbersCalcu = new _12_TwoNumbersCalcu();
        twoNumbersCalcu.Calculator();

    }

    public void Calculator ()
    {
        int x, y, ans;
        char symb;
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter your First Number : ");
        x = scan.nextInt();

        System.out.print("Enter your Second Number : ");
        y = scan.nextInt();

        System.out.print("Chose your Symbol among (+, -, *, /) : ");
        symb = scan.next().charAt(0);

        if(symb == '+')
        {
            ans = x + y;
            System.out.print("Two Number Addition = " +ans);
        }
        else if(symb == '-')
        {
            ans = x - y;
            System.out.print("Two Number Sub = " +ans);
        }
        else if(symb == '*')
        {
            ans = x * y;
            System.out.print("Two Number Multiplication = " +ans);
        }
        else if(symb == '/')
        {
            ans = x / y;
            System.out.print("Division = " +ans);
        }
        else
        {
            System.out.print("Wrong Symbol ");
        }
    }

}
