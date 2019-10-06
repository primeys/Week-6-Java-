import com.sun.source.tree.CaseTree;

import java.util.Scanner;

public class _11_CityName_Switch {
    public static void main(String[] args)
    {
        cityNameSwitch();
    }

    public static void cityNameSwitch() {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter city name first character : ");

        String cityName = scanner.next();

        switch (cityName) {
            case "a":
                System.out.println("Ananad");
                break;
            case "b":
                System.out.println("Bombay");
                break;
            case "c":
                System.out.println("Calcutta");
                break;
            case "d":
                System.out.println("Delhi");
                break;
            case "e":
                System.out.println("Empal");
                break;
            case "f":
                System.out.println("Faridabad");
                break;
            default:
                System.out.println("Invalid Char inter " + "Please enter between a to f ");
                break;
        }

    }
}
