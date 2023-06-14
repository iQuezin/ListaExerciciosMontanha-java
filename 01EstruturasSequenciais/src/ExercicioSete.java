
//7. Faça um Programa que calcule a área de um quadrado, em seguida mostre o dobro desta área para o usuário.
import java.util.Scanner;

public class ExercicioSete {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double lado, area, dobro;

        System.out.print("Digite o lado do quadrado: ");
        lado = scanner.nextDouble();

        area = Math.pow(lado, 2);
        dobro = area * 2;

        System.out.printf("A área do quadrado é %.2f, e o seu dobro é %.2f.", area, dobro);
        scanner.close();
    }
}