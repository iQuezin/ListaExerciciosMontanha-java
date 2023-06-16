import java.util.Scanner;

public class ExercicioVinteEDois {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe um número inteiro: ");
        int numero = scanner.nextInt();

        int divisao = numero % 2;

        if (divisao == 0) {
            System.out.println("Número par.");
        } else {
            System.out.println("Número ímpar.");
        }

        scanner.close();
    }
}
