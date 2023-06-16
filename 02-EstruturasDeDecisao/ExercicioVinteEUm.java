import java.util.Scanner;

public class ExercicioVinteEUm {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor do saque (entre 10 e 600 reais): ");
        int valorSaque = scanner.nextInt();

        if (valorSaque < 10 || valorSaque > 600) {
            System.out.println("Valor inválido. O valor do saque deve estar entre 10 e 600 reais.");
        } else {
            int[] notas = { 100, 50, 10, 5, 1 };
            int[] quantidadeNotas = new int[notas.length];

            for (int i = 0; i < notas.length; i++) {
                if (valorSaque >= notas[i]) {
                    quantidadeNotas[i] = valorSaque / notas[i];
                    valorSaque %= notas[i];
                }
            }

            System.out.println("Quantidade de notas:");
            for (int i = 0; i < notas.length; i++) {
                if (quantidadeNotas[i] > 0) {
                    System.out.println(quantidadeNotas[i] + " nota(s) de " + notas[i] + " reais");
                }
            }
        }

        scanner.close();
    }
}