import java.util.Scanner;

public class _14_InputValueFinder
{

    public static void main(String[] args)
    {
    _14_InputValueFinder.ValueFind();
    }

    public static void ValueFind()
    // ASCII value
            //Upper case Alphabets 65 -90
            // Lower case Alphabets 97-122
            // for the digits 48 - 57
            // rest all value is special char.

    {
        int number;

        System.out.println("Enter your digit  = ");

        Scanner scanner = new Scanner(System.in);
         number= scanner.nextInt();

        if (number >= 65 && number <= 90)
            {
            System.out.println(" This is Upper case value : ");
        }
        else if (number >= 97 && number <= 122) {
            System.out.println("This is Lower Case Value : ");
        }
        else if (number >= 48 && number <= 57)
        {
            System.out.println("This is Digit :");
        }
        else {
            System.out.println("Special Character :");
        }

    }


}
