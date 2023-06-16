import java.util.Scanner;

public class ExercicioQuatorze {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double notaUm, notaDois, media;
        String conceito, mensagem;

        System.out.print("Digite a primeira nota: ");
        notaUm = scanner.nextDouble();

        System.out.print("Digite a segunda nota: ");
        notaDois = scanner.nextDouble();

        media = (notaUm + notaDois) / 2;

        if (media >= 9 && media <= 10) {
            conceito = "A";
            mensagem = "Aprovado";
        } else if (media >= 7.5 && media < 9) {
            conceito = "B";
            mensagem = "Aprovado";
        } else if (media >= 6 && media < 7.5) {
            conceito = "C";
            mensagem = "Aprovado";
        } else if (media >= 4 && media < 6) {
            conceito = "D";
            mensagem = "Reprovado";
        } else {
            conceito = "E";
            mensagem = "Reprovado";
        }

        System.out.println("Média     Conceito     Resultado");
        System.out.println(media + "          " + conceito + "         " + mensagem);

        scanner.close();
    }
}