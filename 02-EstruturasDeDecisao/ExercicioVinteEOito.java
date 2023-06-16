import java.util.Scanner;

public class ExercicioVinteEOito {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Tipos de carne disponíveis:");
            System.out.println("1. File Duplo");
            System.out.println("2. Alcatra");
            System.out.println("3. Picanha");

            System.out.print("Digite o número correspondente ao tipo de carne: ");
            int tipoCarne = scanner.nextInt();

            System.out.print("Digite a quantidade de carne em Kg: ");
            double quantidade = scanner.nextDouble();

            System.out.print("Digite 'C' para pagamento em dinheiro ou 'T' para pagamento no cartão Tabajara: ");
            String formaPagamento = scanner.next();

            String nomeCarne;
            double precoKg;
            double precoTotal;

            switch (tipoCarne) {
                case 1:
                    nomeCarne = "File Duplo";
                    if (quantidade <= 5) {
                        precoKg = 4.90;
                    } else {
                        precoKg = 5.80;
                    }
                    break;
                case 2:
                    nomeCarne = "Alcatra";
                    if (quantidade <= 5) {
                        precoKg = 5.90;
                    } else {
                        precoKg = 6.80;
                    }
                    break;
                case 3:
                    nomeCarne = "Picanha";
                    if (quantidade <= 5) {
                        precoKg = 6.90;
                    } else {
                        precoKg = 7.80;
                    }
                    break;
                default:
                    System.out.println("Opção inválida.");
                    return;
            }

            precoTotal = precoKg * quantidade;
            double desconto = 0.0;
            String tipoPagamento;

            if (formaPagamento.equalsIgnoreCase("T")) {
                desconto = precoTotal * 0.05;
                tipoPagamento = "Cartão Tabajara";
            } else {
                tipoPagamento = "Dinheiro";
            }

            double valorAPagar = precoTotal - desconto;

            System.out.println("\nCupom Fiscal");
            System.out.println("Tipo de carne: " + nomeCarne);
            System.out.println("Quantidade: " + quantidade + " Kg");
            System.out.printf("Preço total: R$ %.2f", precoTotal);
            System.out.println("\nTipo de pagamento: " + tipoPagamento);
            System.out.printf("Valor do desconto: R$ %.2f", desconto);
            System.out.printf("\nValor a pagar: R$ %.2f", valorAPagar);
        }

    }
}
