import java.util.Scanner;

public class ExercicioVinteESeis {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Digite o número de litros vendidos: ");
            int litros = scanner.nextInt();

            System.out.print("Digite o tipo de combustível (A-álcool, G-gasolina): ");
            String tipoCombustivel = scanner.next();

            double precoLitro;
            double desconto;
            double valorTotal;

            if (tipoCombustivel.equalsIgnoreCase("A")) {
                precoLitro = 1.90;

                if (litros <= 20) {
                    desconto = 0.03;
                } else {
                    desconto = 0.05;
                }
            } else if (tipoCombustivel.equalsIgnoreCase("G")) {
                precoLitro = 2.50;

                if (litros <= 20) {
                    desconto = 0.04;
                } else {
                    desconto = 0.06;
                }
            } else {
                System.out.println("Tipo de combustível inválido.");
                return;
            }

            double valorDesconto = precoLitro * litros * desconto;
            valorTotal = precoLitro * litros - valorDesconto;

            System.out.println("Valor a ser pago: R$" + valorTotal);
        }
    }
}
