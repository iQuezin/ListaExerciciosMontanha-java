import java.util.Scanner;

public class ExercicioCinco {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double notaUm, notaDois, media;

        System.out.print("Digite a primeira nota: ");
        notaUm = scanner.nextDouble();

        System.out.print("Digite a segunda nota: ");
        notaDois = scanner.nextDouble();

        media = (notaUm + notaDois) / 2;

        if (media >= 7 && media < 10) {
            System.out.println("Média Final: " + media);
            System.out.println("Aprovado!");
        } else if (media < 7) {
            System.out.println("Média Final: " + media);
            System.out.println("Reprovado!");
        } else if (media == 10) {
            System.out.println("Média Final: " + media);
            System.out.println("Aprovado com Distinção!");
        }

        scanner.close();
    }
}
