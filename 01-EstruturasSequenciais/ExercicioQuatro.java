
//4. Faça um Programa que peça as 4 notas bimestrais e mostre a média.
import java.util.Scanner;

public class ExercicioQuatro {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double notaUm, notaDois, notaTres, notaQuatro, media;

        System.out.print("Digite a primeira nota: ");
        notaUm = scanner.nextDouble();
        System.out.print("Digite a segunda nota: ");
        notaDois = scanner.nextDouble();
        System.out.print("Digite a terceira nota: ");
        notaTres = scanner.nextDouble();
        System.out.print("Digite a quarta nota: ");
        notaQuatro = scanner.nextDouble();

        media = (notaUm + notaDois + notaTres + notaQuatro) / 4;
        System.out.printf("A média entre %.1f/ %.1f/ %.1f/ %.1f é: %.1f", notaUm, notaDois, notaTres, notaQuatro,
                media);
        scanner.close();
    }
}
