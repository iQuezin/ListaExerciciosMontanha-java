import java.util.Scanner;

public class ExercicioVinteETres {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número: ");
        double numero = scanner.nextDouble();

        if (ehInteiro(numero)) {
            System.out.println("O número é inteiro.");
        } else {
            System.out.println("O número é decimal.");
        }

        scanner.close();
    }

    public static boolean ehInteiro(double numero) {
        return numero == Math.round(numero);
    }
}
