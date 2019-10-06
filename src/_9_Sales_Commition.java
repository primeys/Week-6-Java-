import java.util.Scanner;

public class _9_Sales_Commition {
    public static void main(String[] atrgs) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Seller's Name");
        String name = scanner.next();

        System.out.println("Enter Seller's ID");
        String ID = scanner.next();

        System.out.println("Enter Seller's Basic Salary");
        double Basic = scanner.nextDouble();

        System.out.println("Enter sales Amount");
        double Amount = scanner.nextDouble();

        double commission;
        if (Amount >= 50000) {
            commission = (Amount * 35 / 100);
        } else if (Amount >= 30000) {
            commission = (Amount * 20 / 100);
        } else if (Amount >= 20000) {
            commission = (Amount * 10 / 100);
        } else if (Amount >= 10000) {
            commission = (Amount * 5 / 100);
        } else if (Amount < 10000 && Amount >= 1) {
            commission = Amount * 2 / 100;
        } else {
            commission = 0;
        }

        double total = Basic + commission;

        System.out.println("................Pay Slip...............");
        System.out.println(" Name:.............."             + name);
        System.out.println(" Id:................"               + ID);
        System.out.println(" Basic Salary:......"            + Basic);
        System.out.println(" Commission:........"       + commission);
        System.out.println(" Total Salary:......"            + total);

    }

}
