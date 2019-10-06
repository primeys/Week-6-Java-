public class _13_Number_Div_By_3_5 {

    public static void main(String[] args) {
        _13_Number_Div_By_3_5.DividedBy3and5();
    }

    public static void DividedBy3and5() {
        System.out.println("\n Number 1 to 100 Divided by 3: ");
        for (int a = 1; a < 100; a++) {
            if (a % 3 == 0)
                System.out.print(a + ", ");
        }

        System.out.println("\n\n Number 1 to 100 Divided by 5: ");
        for (int b = 1; b < 100; b++) {
            if (b % 5 == 0) System.out.print(b + ", ");
        }

        System.out.println("\n\n Number 1 to 100 Divided by 3 & 5: ");
        for (int c = 1; c < 100; c++) {
            if (c % 3 == 0 && c % 5 == 0) System.out.print(c + ", ");
        }
        System.out.println("\n");
    }

}
