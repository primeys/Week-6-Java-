import java.util.Scanner;

public class _1_Even_Odd_Number {
//    Write a java program that tell us that Input number is odd or even?
    public static void main (String[] args)
    {
        //static method call into main method
        Even_Odd();


    }

    public static void Even_Odd ()
    {
        int a;
        System.out.println("Enter number");
        Scanner scanner = new Scanner(System.in);
        a = scanner.nextInt();
        if(a%2 ==0)
        {
            System.out.println("Entered Number " +a+ "is Even Number");
        } else
            {
                System.out.println("Enter Number  " +a+ " is Odd number");
            }


    }

}
