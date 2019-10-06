import java.util.Scanner;

public class _6_Salary {
    public static void main (String[]args)
    {
        Scanner scanner = new Scanner (System.in);
        System.out.println(" Enter Employee Name");
        String name= scanner.next();

        System.out.println("Inter Employee ID");
        int Id= scanner.nextInt();

        System.out.println("Inter Employee Salary");
        double salary =scanner.nextDouble();

        double HRA = (salary*10/100);
        double DA  = (salary*8/100);
        double TA  = (salary*9/100);
        double PF  = (salary *20/100);
        double GS  = (salary + HRA + DA + TA - PF);
        System.out.println(" _____________________________________");
        System.out.println(" |____________Salary slip____________|");
        System.out.println(" |Employee ID  : "  + Id+       "\t\t\t|");
        System.out.println(" |Employee Name: " + name+ "\t \t\t    |");
        System.out.println(" |_________________________________|");
        System.out.println(" |Employee Basic Salary\t = :" +salary+ "\t|");
        System.out.println(" |HRA 10%\t   :"  +HRA+   "\t\t\t\t|");
        System.out.println(" |DA 8%\t\t   :"  +DA +     "\t\t\t\t|");
        System.out.println(" |TA 9%\t\t   :"  +TA +       "\t\t\t\t|");
        System.out.println(" |PF-20%\t\t  :"  + PF+       "\t\t\t|");
        System.out.println(" |Employee Gross Salary\t : " +GS+      "\t|");
        System.out.println(" |_________________________________|");
    }


}
