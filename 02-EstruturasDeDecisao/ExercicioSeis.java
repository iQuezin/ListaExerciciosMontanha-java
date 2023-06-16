import java.util.Scanner;

public class ExercicioSeis {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        double numeroUm = scanner.nextDouble();

        System.out.print("Digite o segundo número: ");
        double numeroDois = scanner.nextDouble();

        System.out.print("Digite o terceiro número: ");
        double numeroTres = scanner.nextDouble();

        if (numeroUm > numeroDois && numeroUm > numeroTres) {
            System.out.println("Maior numero: " + numeroUm);
        } else if (numeroDois > numeroUm && numeroDois > numeroTres) {
            System.out.println("Maior número: " + numeroDois);
        } else {
            System.out.println("Maior número: " + numeroTres);
        }

        scanner.close();
    }
}
