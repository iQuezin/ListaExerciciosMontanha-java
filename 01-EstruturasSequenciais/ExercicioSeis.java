
//6. Faça um Programa que peça o raio de um círculo, calcule e mostre sua área.
import java.util.Scanner;

public class ExercicioSeis {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double raio, area;

        System.out.print("Informe o raio do cirulo: ");
        raio = scanner.nextDouble();

        area = Math.PI * (Math.pow(raio, 2));
        System.out.printf("A área do circulo é: %.2f", area);
        scanner.close();
    }
}
