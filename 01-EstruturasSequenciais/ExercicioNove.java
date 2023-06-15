
//9. Faça um Programa que peça a temperatura em graus Fahrenheit, transforme e mostre a temperatura em graus Celsius.
// C = 5 * ((F-32) / 9).
import java.util.Scanner;

public class ExercicioNove {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double fahrenheit, celsius;

        System.out.print("Digite os graus em Fahrenheit: ");
        fahrenheit = scanner.nextDouble();

        celsius = 5 * ((fahrenheit - 32) / 9);
        System.out.printf("%.1f° Fahrenheit são %.1f° Celsius.", fahrenheit, celsius);
        scanner.close();
    }
}
