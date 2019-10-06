import java.util.Scanner;

public class _3_Student_Mark_Sheet
{
    public static void main(String[] args)
    {

        _3_Student_Mark_Sheet smark = new _3_Student_Mark_Sheet();
        smark.markSheet();

    }

    public static void markSheet()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Enter Student name");
        String name = scanner.next();

        System.out.println( " Enter Roll Number");
        String rollNumber = scanner.next();

        System.out.println(" Enter Maths Mark");
        int Maths = scanner.nextInt();
        if(Maths <0|| Maths>100)
            System.out.println("Marks Should not be Negative");

        System.out.println(" Enter Science Marks");
        int Science= scanner.nextInt();
        if (Science <0)
            System.out.println("Marks Should not be Negative");

        System.out.println(" Enter English Marks ");
        int English=scanner.nextInt();
        if (English <0)
            System.out.println("Marks Should not be Negative");

        int Total = Maths + Science + English;
        float a = (Total)/3;
        System.out.println("|________________________________|");
        System.out.println("|........Mark Sheet..............|");
        System.out.println("|________________________________|");
        System.out.println("|Student Name     :" + name +"\t\t|");
        System.out.println("|Roll Number      :" + rollNumber+"\t\t|");
        System.out.println("|________________________________|");
        System.out.println("|Subject          :   Marks    |");
        System.out.println("|________________________________|");
        System.out.println("|Maths \t\t\t  :" + Maths +"\t\t\t|");
        System.out.println("|Science \t\t  :" + Science+"\t\t\t|");
        System.out.println("|English \t\t  :" + English+"\t\t\t|");
        System.out.println("|__________________________________|");
        System.out.println("|\n Total \t\t :" + Total+"\t\t\t|");
        System.out.println("|\n percentage\t\t :" +a+"\t\t\t |");
        //System.out.println("|\n Grade\t:" +a +"\t\t         |");

        if (a>=80)
        {System.out.println(" Grade A+");}
        else if (a >= 60)
        { System.out.println(" Grade A");}
        else if ( a >=50)
        {System.out.println("  Grade B");}
        else if ( a>=35)
        {System.out.println (" Grade C");}
        else if (a < 35)
        {System.out.println(" Fail");}
    }
    }



