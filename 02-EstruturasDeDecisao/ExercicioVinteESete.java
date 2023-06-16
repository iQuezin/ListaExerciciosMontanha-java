import java.util.Scanner;

public class ExercicioVinteESete {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double morangoRS, macaRS;

        System.out.print("Digite a quantidade de morangos(em kg): ");
        double morango = scanner.nextDouble();

        System.out.print("Digite a quantidade de maçãs(em kg): ");
        double maca = scanner.nextDouble();

        if (morango <= 5) {
            morangoRS = 2.5;
        } else {
            morangoRS = 2.2;
        }

        if (maca <= 5) {
            macaRS = 1.8;
        } else {
            macaRS = 1.5;
        }

        double quantidadeKG = morango + maca;
        double valorTotal = (morango * morangoRS) + (maca * macaRS);
        double desconto = 0;

        if (quantidadeKG > 8 || valorTotal > 25) {
            desconto = valorTotal * 0.1;
        }

        double valorFinal = valorTotal - desconto;

        System.out.printf("Valor: R$ %.2f.", valorFinal);
        System.out.printf("\nSendo %.1fkg de morangos e %.1fkg de maçâ.", morango, maca);
        System.out.printf("\nTotal de KG: %.1f.", quantidadeKG);

        scanner.close();

    }
}
