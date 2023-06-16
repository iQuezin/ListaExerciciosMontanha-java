import java.util.Scanner;

public class ExercicioDezessete {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int ano, bissexto;

        System.out.print("Informe um ano: ");
        ano = scanner.nextInt();

        bissexto = ano % 4;

        if (bissexto == 0) {
            System.out.println(" O ano informado é um ano bissexto.");
        } else {
            System.out.println("O ano informado não é um ano bissexto.");
        }

        scanner.close();
    }
}
