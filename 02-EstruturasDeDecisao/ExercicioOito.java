import java.util.Scanner;

public class ExercicioOito {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double precoUm, precoDois, precoTres;

        System.out.print("Digite o valor do primeiro poduto: R$ ");
        precoUm = scanner.nextDouble();

        System.out.print("Digite o valor do segundo poduto: R$ ");
        precoDois = scanner.nextDouble();

        System.out.print("Digite o valor do terceiro poduto: R$ ");
        precoTres = scanner.nextDouble();

        double min = Math.min(Math.min(precoUm, precoDois), precoTres);

        if (min == precoUm) {
            System.out.printf("O melhor produto é o produto 01, no valor de R$ %.2f", precoUm);
        } else if (min == precoDois) {
            System.out.printf("O melhor produto é o produto 02, no valor de R$ %.2f", precoDois);
        } else if (min == precoTres) {
            System.out.printf("O melhor produto é o produto 03, no valor de R$ %.2f", precoTres);
        }

        scanner.close();
    }
}
