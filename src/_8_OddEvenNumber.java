import java.util.Scanner;

public class _8_OddEvenNumber
{
    public static void main(String[] args)
    {

        _8_OddEvenNumber.FindOddEven();

    }

    public static void FindOddEven()
    {
        int a;

        System.out.println("Enter any number to find is it odd or even");
        Scanner scanner = new Scanner(System.in);

        a = scanner.nextInt();

        if (a % 2 == 0)
            System.out.println("This number is even.");
        else
            System.out.println("This number is odd.");

    }

}
