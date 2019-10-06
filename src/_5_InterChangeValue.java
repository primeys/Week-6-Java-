import java.util.Scanner;

public class _5_InterChangeValue {

    public  static void main (String[] args)
    {
        _5_InterChangeValue intValue = new _5_InterChangeValue();
        intValue.valueChange();

    }

    public void valueChange()
    {
        int a, b ;
        //System.out.println("Enter a and b");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the value of a ");
        a = scanner.nextInt();

        System.out.println("Enter the value of b ");
        b = scanner.nextInt();

        System.out.println( "You enter numbers\na = "+a+"\nb = "+b);

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println( "After Swapping the numbers\na = "+a+"\nb = "+b);

    }


}


