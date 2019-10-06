import java.util.Scanner;

public class _10_CityName_If_Else {
    public static void main(String[] args) {

        _10_CityName_If_Else cityName_if_else = new _10_CityName_If_Else();
        cityName_if_else.CityName();

    }

    public void CityName() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter alpha bate between a to f  : ");

        String cityName = scanner.next();

        if (cityName.equalsIgnoreCase("a"))

            System.out.println("Ananad");

        else if (cityName.equalsIgnoreCase("b"))

            System.out.println("Bombay");

        else if (cityName.equalsIgnoreCase("c"))

            System.out.println("Calcutta");

        else if (cityName.equalsIgnoreCase("d"))

            System.out.println("Delhi");

        else if (cityName.equalsIgnoreCase("e"))

            System.out.println("Empal");

        else if (cityName.equalsIgnoreCase("f"))

            System.out.println("Faridabad");

        else

            System.out.println("Invalid Char inter " + "Please enter between a to f ");

    }

}




