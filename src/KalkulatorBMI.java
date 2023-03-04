import java.util.Scanner;

public class KalkulatorBMI {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Witaj w kalkulatorze BMI!");

        System.out.print("Podaj swoją wagę w kilogramach: ");
        double waga = scanner.nextDouble();

        System.out.print("Podaj swój wzrost w centymetrach: ");
        double wzrost = scanner.nextDouble();

        // Konwersja wzrostu z centymetrów na metry
        wzrost = wzrost / 100;

        // Obliczenie wartości BMI
        double bmi = waga / (wzrost * wzrost);

        // Wyświetlenie wyniku
        System.out.printf("Twoje BMI wynosi: %.2f%n", bmi);

        // Określenie kategorii wagowej
        if (bmi < 18.5) {
            System.out.println("Masz niedowagę.");
        } else if (bmi >= 18.5 && bmi < 25) {
            System.out.println("Twoja waga jest prawidłowa.");
        } else if (bmi >= 25 && bmi < 30) {
            System.out.println("Masz nadwagę.");
        } else {
            System.out.println("Masz otyłość.");
        }
    }

}
