
//10. Faça um Programa que peça a temperatura em graus Celsius, transforme e mostre em graus Fahrenheit.
import java.util.Scanner;

public class ExercicioDez {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double celsius, fahrenheit;

        System.out.print("Informe a temperatura em °Celsius: ");
        celsius = scanner.nextDouble();

        fahrenheit = (celsius * 1.8) + 32;
        System.out.printf("%.1f° Celsius são %.1f° Fahrenheit.", celsius, fahrenheit);
        scanner.close();
    }
}
