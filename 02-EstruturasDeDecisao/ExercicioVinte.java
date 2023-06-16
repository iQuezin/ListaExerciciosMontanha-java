import java.util.Scanner;

public class ExercicioVinte {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double notaUm, notaDois, notaTres, media;
        String resultado;

        System.out.print("Informe a primeira nota: ");
        notaUm = scanner.nextDouble();

        System.out.print("Informe a segunda nota: ");
        notaDois = scanner.nextDouble();

        System.out.print("Informe a terceira nota: ");
        notaTres = scanner.nextDouble();

        media = (notaUm + notaDois + notaTres) / 3;

        if (media == 10) {
            resultado = "Aprovado com Distinção.";
        } else if (media >= 7) {
            resultado = "Aprovado";
        } else {
            resultado = "Reprovado";
        }

        System.out.println(resultado);
        System.out.printf("Média alcançada: %.1f.", media);

        scanner.close();
    }
}
