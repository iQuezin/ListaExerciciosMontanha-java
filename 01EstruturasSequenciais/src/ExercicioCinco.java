
//5. Faça um Programa que converta metros para centímetros
import java.util.Scanner;

public class ExercicioCinco {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double metros, centimetros;

        System.out.print("Digite o número em métros: ");
        metros = scanner.nextDouble();

        centimetros = metros * 100;
        System.out.printf("%.0f metros é igual a: %.1f centimetros.", metros, centimetros);
        scanner.close();
    }
}